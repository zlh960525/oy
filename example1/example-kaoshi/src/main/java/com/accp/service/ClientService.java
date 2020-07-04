package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AddressMapper;
import com.accp.dao.ClientMapper;
import com.accp.domain.Address;
import com.accp.domain.Client;

@Service
@Transactional
public class ClientService {

	@Autowired
	private ClientMapper mapper;
	
	@Autowired
	private AddressMapper addressMapper;
	
	//按id查询
	public Client findByid(String id) {
		Client client=mapper.selectByPrimaryKey(id);
		if(client==null) {
			return null;
		}
		Address add=addressMapper.maxSelect(id);
		client.setAddress(add);
		return client;
	}
	
	//新增和修改的判断
	public String create(Client client) {
		Client client1=mapper.selectByPrimaryKey(client.getId());
		if(client1==null) {
			mapper.insert(client);
			client.getAddress().setClientid(client.getId());
			client.getAddress().setId(0);
			addressMapper.insert(client.getAddress());
			return "0000";
		}else {
			mapper.updateByPrimaryKey(client);
			Address add=addressMapper.selectByPrimaryKey(client.getAddress().getId());
			if(add==null) {
				client.getAddress().setClientid(client.getId());
				client.getAddress().setId(0);
				addressMapper.insert(client.getAddress());
			}else {
				addressMapper.updateByPrimaryKey(client.getAddress());
			}
			return "0001";
		}
	}
}

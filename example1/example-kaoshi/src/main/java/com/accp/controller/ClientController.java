package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Client;
import com.accp.service.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	ClientService service;

	@RequestMapping("/toFind")
	public String toFind() {
		return "find";
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public Client find(String id) {
		return service.findByid(id);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(@RequestBody Client client) {
		return service.create(client);
	}
}

package com.accp.dao;

import com.accp.domain.Client;
import com.accp.domain.ClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientMapper {
    int countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int deleteByPrimaryKey(String id);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExample(ClientExample example);

    Client selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}
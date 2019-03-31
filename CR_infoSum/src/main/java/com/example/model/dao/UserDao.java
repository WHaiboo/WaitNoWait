package com.example.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.model.bean.User;

@Mapper
public interface UserDao {
	//验证手机号和密码是否一致
	public User find(@Param("phone")Integer phone, @Param("password")String password);
	
	//查询该手机是否被注册
	public User findPhone(@Param("phone")Integer phone);
}

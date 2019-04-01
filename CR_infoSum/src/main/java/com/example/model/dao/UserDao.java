package com.example.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.model.bean.User;




/** @version:
* @Description: 
* @Param :
* @author: Winner杨 
* @date:2019年4月2日上午12:15:03  
*/ 
@Mapper
public interface UserDao {
	//验证手机号和密码是否一致
	public User find(@Param("phone")Integer phone, @Param("password")String password);
	
	//查询该手机是否被注册
	public User findPhone(@Param("phone")Integer phone);
	
	//company的全部信息和算出各个时间的时间差根据时间差排序从大到小
	List<company> queryAll(@Param("offset") int offset,@Param("limit") int limit);
	
	//插入一条数据
	
	
	/**
	 * @author Administrator
	 * 查询某个公司的排行榜 
	 *
	 */ 
	
	//查询某个岗位的排行榜
	
	//
}

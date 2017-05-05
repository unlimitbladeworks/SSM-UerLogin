package com.sy.dao;

import org.apache.ibatis.annotations.Param;

import com.sy.entity.User;

public interface UserDao {
	
	
	/**
	 * 查找用户名和密码
	 * @param username 登录用户名 
	 * @param password 密码
	 * @return
	 */
	User findByUsername(String username);

	
	/**
	 * 注册用户和密码
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	User registerByUsernameAndPassword(@Param("username")String username,
										@Param("password")String password);
}

package com.sy.service;


import com.sy.entity.User;

//Service层接口
public interface UserService {
	
	//检验用户登录
	User checkLogin(String username,String password);

}

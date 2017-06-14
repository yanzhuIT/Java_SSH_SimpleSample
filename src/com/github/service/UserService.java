package com.github.service;

import org.springframework.transaction.annotation.Transactional;

import com.github.dao.UserDao;
import com.github.dao.UserDaoImpl;


@Transactional
public class UserService {
	
	//注入Dao对象
	
	//这里注入的是接口的变量（实际上是实现类对象的引用变量，对应关系会在spring中配置）
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add(){
//		UserDao userDao = new UserDaoImpl();
		
		System.out.println("service.............");
		userDao.add();
	}

}

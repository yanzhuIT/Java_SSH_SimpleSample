package com.github.service;

import org.springframework.transaction.annotation.Transactional;

import com.github.dao.UserDao;
import com.github.dao.UserDaoImpl;


@Transactional
public class UserService {
	
	//ע��Dao����
	
	//����ע����ǽӿڵı�����ʵ������ʵ�����������ñ�������Ӧ��ϵ����spring�����ã�
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

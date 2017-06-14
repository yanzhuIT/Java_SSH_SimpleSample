package com.github.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.github.entity.User;

public class UserDaoImpl implements UserDao {

	// ע��hibernateģ���������һ��Ҫ�ǵ�ѡhibernate5������������������
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// ʹ��spring��Ӧ��hibernateģ�巽��
	@Override
	public void add() {
		/*
		 * HibernateTemplate hibernateTemplate = new
		 * HibernateTemplate(sessionFactory); hibernateTemplate.save(entity);
		 */

		/*
		 * User user = new User(); user.setAddress("US");
		 * user.setUsername("zhu"); hibernateTemplate.save(user);
		 */

		/*
		 * User user = hibernateTemplate.get(user.class, 2);
		 * System.out.println(user);
		 */

		// �����User���������õ���hql���
		/*
		 * List<User> list = (List<User>) hibernateTemplate.find("from User");
		 * for (User user : list) { System.out.println(user); }
		 */

		List<User> list = (List<User>) hibernateTemplate.find("from User where username=?", "zhu");
		for (User user : list) {
			System.out.println(user);
		}

	}

}

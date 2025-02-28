package com.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.User;
import com.apps.sms.dao.UserDao;
import com.apps.sms.service.UserService;

/**
 * 校园逻辑处理的实现类
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService{
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private UserDao userDao;

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

	@Override
	public void saveOrUpdate(User user) throws Exception {
		if(user.getId()==null) {
			userDao.insert(user);
		} else {
			userDao.update(user);
		}
		
	}
}

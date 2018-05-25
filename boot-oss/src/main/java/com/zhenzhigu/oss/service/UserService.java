package com.zhenzhigu.oss.service;

import java.util.List;

import com.zhenzhigu.oss.mapper.UserMapper;
import com.zhenzhigu.oss.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public AjaxResult queryList() {
		List<User> list = userMapper.queryList();
		return new AjaxResult(list);
	}

	public AjaxResult save(User user) {

		return new AjaxResult();
	}

	public AjaxResult batchDelete(Integer[] ids) {
		userMapper.batchDelete(ids);
		return new AjaxResult();
	}

	public AjaxResult update(User user) {
		userMapper.update(user);
		return new AjaxResult();
	}

}

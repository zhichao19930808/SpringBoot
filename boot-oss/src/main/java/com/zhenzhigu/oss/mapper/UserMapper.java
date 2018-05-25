package com.zhenzhigu.oss.mapper;

import java.util.List;

import com.zhenzhigu.oss.entity.User;

public interface UserMapper {

	List<User> queryList();

	void save(User user);

	void batchDelete(Integer[] ids);

	void update(User user);

}

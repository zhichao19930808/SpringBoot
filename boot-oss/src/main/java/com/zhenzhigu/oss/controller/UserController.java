package com.zhenzhigu.oss.controller;


import com.itshidu.common.web.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zhenzhigu.oss.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello.html")
	public String demo(){
		return "demo";
	}

	@ResponseBody
	@RequestMapping("/login")
	public AjaxResult demo2(){

		return AjaxResult.ok().put("code",1);
	}

}

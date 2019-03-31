package com.example.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.bean.User;
import com.example.model.dao.UserDao;

// @RestController = @Controller + @ResponseBody
@RestController(value="userController")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping(value = "index.do")
	public ModelAndView index() {
		return new ModelAndView("login");
	}
	
	
	@GetMapping(value = "goRegister.do")
	public ModelAndView goRegister() {
		return new ModelAndView("register"); // 此处指向界面
	}
	
	@GetMapping(value = "register.do")
	public Object register(Integer phone,String password, String name) {
		System.out.println(phone+password+name);
		if (StringUtils.isEmpty(phone)&&StringUtils.isEmpty(name)) {
			return "手机号码/密码不能为空";
		}else {
			ModelAndView mav = new ModelAndView("login");// 此处指向登陆界面
			mav.getModel().put("phone", phone);
			return mav; 
		}
		
	}
	
	@GetMapping(value = "login.do")
	public Object login(Integer phone, String password) {
		System.out.println("传入参数：Integer=" + phone + ", password=" + password);
		if (StringUtils.isEmpty(phone)) {
			return "phone不能为空";
		} else if (StringUtils.isEmpty(password)) {
			return "password不能为空";
		}
		User user = userDao.find(phone, password);
		if (user != null) {
			return user;
		} else if(userDao.findPhone(phone)==null){
			 return "该手机号未注册";
		} else {
			return "密码错误";
		}
	}

}

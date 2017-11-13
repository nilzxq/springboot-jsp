package com.edu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @classDes:功能描述:()
* @author zxq 
* @version date：2017年11月8日 下午8:30:23 
*/
@Controller
@EnableAutoConfiguration
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class,args);
	}
}

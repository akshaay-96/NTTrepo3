package com.main.crud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ca")
public class HomeController {
	
	@Value("${server.port}")
	String msg;

	@GetMapping("/geta")
	public String preLogin()
	{
		return "Wlcome to Server-A" +msg;
	}
}

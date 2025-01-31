package com.lpu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/show")
	public String showMsg() {
		return "I like JavaScript More";
	}
	@RequestMapping("/data")
	public int showData() {
		return 100;
	}
	@GetMapping(value = "/accept/{v}")
	public int showParameter(@PathVariable("v")Integer v1) {
		return v1;
	}
	@RequestMapping("/user")
	public String getUserName(@RequestParam(name = "userName") String user) {
		return user;
	}

}

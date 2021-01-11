package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/return/*")
@Log4j
public class ReturnController {

	
	@RequestMapping("/ex1")
	public String method1() {
		log.info("method1");
		return "returnView1";
	}
	
	
	@RequestMapping("/ex2")
	public String method2() {
		log.info("method2");
		
		// 일을 마치면
		// forward or redirect
		return "redirect:/sample/";
	}
	
	@RequestMapping("/ex3")
	public @ResponseBody String method3() {
		log.info("method3");
		
		return "returnValue3 hello world~!~!~!~";
	}
	
	
	@RequestMapping("/ex4")
	public void method4() {
		log.info("method4");
	}
}





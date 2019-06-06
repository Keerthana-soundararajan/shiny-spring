/**
 * 
 */
package com.java.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.test.service.SpringBootService;

/**
 * @author KEERTHANA S
 *
 */
@RestController
public class SpringBootController {
	@Autowired
	public SpringBootService springService;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}

	@RequestMapping("/hello")
	public String myData() {
		return springService.helloService();
	}
}

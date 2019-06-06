/**
 * 
 */
package com.java.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author KEERTHANA S
 *
 */
@SpringBootApplication(scanBasePackages = { "com.java.test.controller", "com.java.test.service" })

public class SpringBootApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootApp.class, args);
	}

}

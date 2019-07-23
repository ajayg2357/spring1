package com.cg.placeholder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("com.cg.placeholder")
@EnableAutoConfiguration
@PropertySource("classpath:/user.properties")
public class UserClient {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("user.xml");
		ApplicationContext context = SpringApplication.run(UserClient.class, args);
		//User user = (User)ctx.getBean("user");
		User user= (User) context.getBean("user");
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		

	}

}

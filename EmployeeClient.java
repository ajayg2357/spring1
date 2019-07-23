package com.cg.customeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=(Employee) ctx.getBean("employee");
		System.out.println(employee.getDate());
		
	}

}

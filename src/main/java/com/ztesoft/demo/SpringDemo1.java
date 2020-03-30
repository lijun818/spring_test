package com.ztesoft.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.entity.Student;

public class SpringDemo1 {
	
	@Test
	public void demo1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Student student =(Student)ac.getBean("student");
		System.out.println(student);*/
		
	}
}

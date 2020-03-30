package com.ztesoft.aop.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo {
	
	@Resource(name="teacher")
	private Teacher teacher;
	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	@Test
	public void demo1(){
		teacher.find();
		teacher.save();
		studentDao.find();
		studentDao.save();
	}
}

package com.ztesoft.aop.demo;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("查询学生");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存学生");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("修改学生");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("删除学生");
	}

}

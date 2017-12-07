package com.schoole.web.service;

import com.schoole.web.bean.StudentBean;

/*
 * find add update 로그인기능 성적확인 성적수정
 */
public interface StudentService {
	public void addStudent(StudentBean student);
	public void addScore(StudentBean score);
	public StudentBean login(StudentBean student);
	public StudentBean find(String id);		
	public	void setCount(int count);
	public int getCount();
	public StudentBean[] list();
	public StudentBean findStudenById(String id);
	public StudentBean[] findStudenByName(String name);
	public void updatePassWord(StudentBean student);
	public void delid(String next);
	
	
}

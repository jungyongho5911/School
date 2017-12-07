package com.schoole.web.serviceImpl;

import com.schoole.web.bean.StudentBean;
import com.schoole.web.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentBean[] students;
	private int count;
	
	public StudentServiceImpl()  {
		this.count = 0;
		students= new StudentBean[2];
	}
	@Override
	public void setCount(int count) {
		this.count = count;	
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void addStudent(StudentBean student ) {
		if(count == students.length) {
			StudentBean[] newStudent = new StudentBean[count+2];
			System.arraycopy(students, 0, newStudent, 0, count);
			students = newStudent;
		}
		this.students[count++] = student;
	}
	@Override
	public void addScore(StudentBean Score) {
	}
	@Override
	public StudentBean login(StudentBean student) {
		
		return null;
	}
	@Override
	public StudentBean find(String id) {
		return null;
	}
	@Override
	public StudentBean[] list() {
		
		return students;
	}
	@Override
	public StudentBean[] findStudenByName(String name) {
		StudentBean[] studentc = null;
		int res = 0;
		for(int i=0; i < count; i++ ) {
			if(name.equals(students[i].getName())) {
				res++;
			}
			}	
		if(res != 0) {
			studentc =  new StudentBean[res];
			int j = 0;
			for(int i=0;i<count;i++) {
				if(name.equals(students[i].getName())) {
					studentc[j] = students[i];
					break;
			}
			}
		}
	return studentc;
	}
	@Override
	public StudentBean findStudenById(String id) {
		StudentBean student = new StudentBean();
		for(int i=0; i < count; i++) {
			if(id.equals(students[i].getId())) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	@Override
	public void updatePassWord(StudentBean student) {
		for(int i=0; i < count; i++) {
			if(student.getId().equals(students[i].getId())) {
				this.students[0].setPass(student.getPass());
			}
		}
		//StudentBean t = findeStudentById(student.getId());
		//t.setPw(student.getPass);
		//findStudenById(student.getId()).setPass(student.getPass());
	}
		@Override
		public void delid(String next) {
			for(int i = 0; i < count; i++) {
				if(next.equals(students[i].getId())) {
					this.students[0] = null;
					students[i] = students[count-1];
					students[count-1] = null;
					count--;
		}
			}
		}
}




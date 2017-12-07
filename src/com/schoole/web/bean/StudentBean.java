	package com.schoole.web.bean;
/*id pass name kor eng math
 * */
public class StudentBean {
	private int kor,math,eng;
	private String name,id,pass;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	} 
	public int getEng() {
		return this.eng;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return this.pass;
	}
	public String toString() {
		return String.format("[이름] %s [ID] %s [비번]%s", name,id,pass);
	}
	
}


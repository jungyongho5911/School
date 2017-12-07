package com.schoole.web.bean;
/*id pass name subject
 * */
public class TeacherBean {
	private String subject,pass,name,id;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPss(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return this.pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
}

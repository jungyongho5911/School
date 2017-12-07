package com.schoole.web.controller;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.school.web.ui.MainPage;
import com.schoole.web.bean.StudentBean;
import com.schoole.web.service.StudentService;
import com.schoole.web.serviceImpl.StudentServiceImpl;
public class StudentController {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			StudentService studentService = new StudentServiceImpl();
			StudentBean student = null;
			StudentBean[] temp1 = null;
			StudentBean[] students = null;
			String message = "";
			while(true) {
				switch(
						JOptionPane.
							showInputDialog(
									"[메뉴] 0.종료 1.학생부등록  2.성적등록  3.총 학생수  4.학생이름 리스트\n"
											+" 5.내정보보기 6.이름 검색 7.비밀번호변경\n"
											+ " 8.삭제 9.화면보기\n")) {
				case "0" :
					JOptionPane.showMessageDialog(null,"시스템종료");
					return;
				case "1" :
					student = new StudentBean();
					student.
					setId(
							JOptionPane.
								showInputDialog(" Id 입력 "));
					student.setPass(
							JOptionPane.
								showInputDialog(" pass입력 "));
					student.setName(
							JOptionPane.
								showInputDialog(" 이름 "));
					studentService.addStudent(student);
					JOptionPane.showMessageDialog(null,"등록완료");
					break;
				case "2" :
					break;
				case "3" :
					JOptionPane.showMessageDialog(
							null,"총학생수는"+ 
								studentService.
									getCount());
					break;
				case "4" :
					message = "";

					students = studentService.list();
					for(int i=0;i<studentService.getCount();i++) {
						message +=(students[i].getName()+"\n");
					}
					JOptionPane.showMessageDialog(null, message);
					break;
				case "5" :
					student = studentService.
						findStudenById(
								JOptionPane.
									showInputDialog("id"));
					break;
				case "6" :
					message = "";

					students = studentService.
					findStudenByName(
							JOptionPane.
								showInputDialog("검색 이름 입력"));
						if(temp1 == null) {
						message = "검색하려는 이름이 존재하지않습니다.";
						}else {
							for(int i=0; i<temp1.length;i++) {
							System.out.println(temp1[i].toString());
							}
						}
						JOptionPane.showConfirmDialog(null, message);
						break;
				case "7" :
					student = new StudentBean();
						student.setId(
							JOptionPane.
								showInputDialog("수정할id입력"));
					student.setPass(
							JOptionPane.
								showInputDialog("수정할비밀번호를입력"));
									studentService.updatePassWord(student);
						JOptionPane.showConfirmDialog(null, "수정완료");		
					break;
				case "8" :
					studentService.delid(
							JOptionPane.
								showInputDialog("삭제할아이디입력"));
					break;
				case "9" :
					MainPage mp = new MainPage();
					break;
					
				}
			}
		}
	}

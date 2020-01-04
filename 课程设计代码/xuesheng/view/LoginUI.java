package view;



import java.util.*;

import biz.CourseBiz;
import biz.StudentBiz;

import entity.Student;



public class LoginUI {	

	private static HashMap<String, Student> students;

	public static void show() {

		Scanner scanner;

		String studentNo;

		String studentPassword;

		StudentBiz studentBiz;

		System.out.println("请输入学号：");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		System.out.println("请输入密码：");
		studentPassword = scanner.nextLine();
		studentBiz = new StudentBiz();
		studentBiz.login(studentNo, studentPassword);
		System.out.println("请选择要进行的操作:1-选课；2-个人中心；0-退出");
		scanner = new Scanner(System.in);
		String caozuo = scanner.nextLine();
	   switch(caozuo){	
	case "1":
		
		 break;
	case "2":
		ModifyPasswordUI.show();
		break;
	   }
	}

}

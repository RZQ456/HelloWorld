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

		System.out.println("������ѧ�ţ�");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		System.out.println("���������룺");
		studentPassword = scanner.nextLine();
		studentBiz = new StudentBiz();
		studentBiz.login(studentNo, studentPassword);
		System.out.println("��ѡ��Ҫ���еĲ���:1-ѡ�Σ�2-�������ģ�0-�˳�");
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

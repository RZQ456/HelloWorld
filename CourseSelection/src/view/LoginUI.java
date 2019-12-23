package view;

import java.util.*;

import biz.StudentBiz;
import entity.Student;

public class LoginUI {	
	private static HashMap<String, Student> students;
	public static void show() {
		Scanner scanner;
		String studentNo;
		String studentPassword;
		StudentBiz studentBiz;
		System.out.println("«Î ‰»Î—ß∫≈£∫");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		Set keySet=students.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			Object key = it.next();
			if(studentNo==key){
				Object value=students.get(key);
			}
		}
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		studentPassword = scanner.nextLine();
		studentBiz = new StudentBiz();
		studentBiz.login(studentNo, studentPassword);
	}
}

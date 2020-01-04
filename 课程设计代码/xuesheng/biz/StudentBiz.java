package biz;

import java.util.HashMap;
import java.util.Scanner;

import dao.IDao;
import dao.StudentDao;
import entity.IEntity;
import entity.Student;
import view.LoginUI;
import view.MainUI;

public class StudentBiz {
	static StudentDao studentDao;
	private static Student student;
	//��¼
	public void login(String studentNo, String studentPassword) {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("�û�������");
			return;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("��¼�ɹ�");
		} else {
			System.out.println("���벻��ȷ");
			MainUI.show();
		}

	}
	//ע�ᣬҵ���߼�ʵ��
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword) {
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			student.setStudentPassword(firstPassword);
			studentDao = StudentDao.getInstance();
			
			studentDao.insert(student);
	
			studentDao.shuchu();
			System.out.println("ע��ɹ���");
			MainUI.show();
		}else {
			System.out.println("ע��ʧ�ܣ�");
		}
	}
	public static void deletestudent() {
		//ע��
		
		IDao stu =new StudentDao();
		stu.delete();
	}
	public static void alterstudent() {
		//�޸�
		IDao stu =new StudentDao();
		stu.update();
		}
	public static void watchstudent() {
		//�鿴
		IDao stu =new StudentDao();
		stu.getAllEntities();
	}
}

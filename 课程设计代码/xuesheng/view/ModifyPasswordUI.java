package view;

import java.util.Scanner;

import biz.StudentBiz;
import dao.IDao;
import dao.StudentDao;

public class ModifyPasswordUI {
	public static void show() {
           System.out.println("��ѡ��Ҫ���еĲ�����1-�޸����룻2-�鿴������Ϣ��0-�˳�");
           Scanner scanner = new Scanner(System.in);
   		String option = scanner.nextLine();
   		switch(option) {
   		case"1":
   			StudentBiz.alterstudent();
   			break;
   		case"2":
   			StudentBiz.watchstudent();
   			break;
   		case"0":
   			return;
   		default:
   				System.out.println("���������");
   		}
	}
}

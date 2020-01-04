package view;

import java.util.Scanner;

import biz.StudentBiz;
import dao.IDao;
import dao.StudentDao;

public class ModifyPasswordUI {
	public static void show() {
           System.out.println("请选择要进行的操作：1-修改密码；2-查看个人信息；0-退出");
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
   				System.out.println("请从新输入");
   		}
	}
}

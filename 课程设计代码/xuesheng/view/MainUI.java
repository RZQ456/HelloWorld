package view;

import java.util.Scanner;

import biz.StudentBiz;
import dao.StudentDao;

public class MainUI {
	public static void show() {
		System.out.println("1-注册；2-登录；3-忘记密码；4-注销用户（管理员权限）；5-课程管理（管理员权限）；0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			LoginUI.show();
			break;
		case"3":
			StudentBiz.alterstudent();
			break;
		case"4":
			StudentBiz.deletestudent();
			break;
		case"5":
			Guanlikecheng.show();
			break;
		case"0":
			System.out.println("退出系统");
			return;
		default:
			System.out.println("请从新输入");
		}
	}
}

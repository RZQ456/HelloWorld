package view;

import java.util.Scanner;

import biz.StudentBiz;
import dao.StudentDao;

public class MainUI {
	public static void show() {
		System.out.println("1-ע�᣻2-��¼��3-�������룻4-ע���û�������ԱȨ�ޣ���5-�γ̹�������ԱȨ�ޣ���0-�˳�");
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
			System.out.println("�˳�ϵͳ");
			return;
		default:
			System.out.println("���������");
		}
	}
}

package view;

import java.io.InputStream;
import java.util.Scanner;

import biz.CourseBiz;
public class Guanlikecheng {
	public static void show() {
		  Scanner scanner;
		  String guanliyuanPassword="123456"; 
		  System.out.println("���������Ա���룺");
		  scanner = new Scanner(System.in);
		  String password = scanner.nextLine();
		  if(guanliyuanPassword.equals(password)) {
			  System.out.println("������Ҫ���еĲ�����1-��ӿγ̣�2-ɾ���γ̣�3-��ʾ�γ̴�٣�4-�޸Ŀγ�");
			  String nn =scanner.nextLine();
			  switch(nn) {
			  case"1":
				  CourseBiz.addclass();
				  break;
			  case"2":
			      CourseBiz.deleteclass();
			      break;
			  case"3":
				  CourseBiz.showclass();
				  break;
			  case"4":
				  CourseBiz.alterclass();
				  break;
			  default:
					  return;
			  }
		  }
		  else {
			  System.out.println("�������");
		  }
	  }
}

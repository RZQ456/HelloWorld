package view;

import java.io.InputStream;
import java.util.Scanner;

import biz.CourseBiz;
public class Guanlikecheng {
	public static void show() {
		  Scanner scanner;
		  String guanliyuanPassword="123456"; 
		  System.out.println("请输入管理员密码：");
		  scanner = new Scanner(System.in);
		  String password = scanner.nextLine();
		  if(guanliyuanPassword.equals(password)) {
			  System.out.println("请输入要进行的操作：1-添加课程；2-删除课程；3-显示课程大纲；4-修改课程");
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
			  System.out.println("密码错误");
		  }
	  }
}

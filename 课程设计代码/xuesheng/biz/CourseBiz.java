package biz;

import java.util.Scanner;

import dao.CourseDao;
import dao.IDao;
import dao.StudentDao;
import entity.Course;
import entity.Student;
import view.Guanlikecheng;
import view.MainUI;

public class CourseBiz {
	static CourseDao courseDao;
	public static  Course course;
	static String courseNo;
	static String courseName;
  public static void jiancha(String courseNo,String courseName) {
	  IDao cou=new CourseDao();
	  course = (Course)cou.getEntity(courseNo);
	  if (courseNo == null) {
			System.out.println("课程不存在");
			Guanlikecheng.show();
		} else if (course.getCourseName().equals(courseName)) {
			return;
		} else {
			System.out.println("课程信息有误");
			Guanlikecheng.show();
		}
  }
  public static void addclass() {
	  IDao cou=new CourseDao();
  }
  public static void deleteclass() {
	  IDao cou=new CourseDao();
		cou.delete();
  }
  public static void showclass() {
	  
  }
  public static void alterclass() {
	  IDao cou=new CourseDao();
	  cou.update();
  }
}

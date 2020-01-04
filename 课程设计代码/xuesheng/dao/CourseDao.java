package dao;
import entity.Course;
import entity.IEntity;
import entity.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import biz.CourseBiz;

public class CourseDao implements IDao {
	static String courseNo;
	static String courseName;
	private static HashMap<String,Course> courses;
	private static  Course course;
	private static CourseDao instance;
	 Scanner scanner = new Scanner(System.in);
	public CourseDao(){
		getUsersFromInputStream("course.txt");	
	}
	private void getUsersFromInputStream(String isName) {
		try {
			FileInputStream fs=new FileInputStream(isName);
			byte[] content = new byte[1024];
			int i=0;
			int conInteger=0;
			while(true) {
				try {
					conInteger=fs.read();
				}catch(IOException e) {
					e.printStackTrace();
				}
				if(conInteger==-1) {
					break;
				}else if('\r'==(char)conInteger||'\n'==(char)conInteger) {
					try {
						this.processUserString(new String(content, "GBK").trim());
						i=0;
					}catch(UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					continue;
				} else {
					content[i]=(byte)conInteger;
				i++;
				}
			}
		}catch(Exception e) {
			e.getStackTrace();
		} 
	}
	public void processUserString(String userString) {
		String [] userFilelds = userString.split(",");
		Course u = new Course();
		u.setCourseNo(userFilelds[0]);
		u.setCourseName(userFilelds[1]);
		u.setCourseGrade(Integer.parseInt(userFilelds[2]));
		insert(course);
	}
	public static CourseDao getInstance() {
		if(instance == null) {
			synchronized(CourseDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
	}
	public void insert(IEntity entity) {
		Course st = (Course)entity;
		courses.put(st.getCourseNo(), st);
	}
	 public void shuchu() {
		  Set<String> courseSet = courses.keySet();
		  StringBuffer uStringBuffer = new StringBuffer();
		  for(String courseNo:courseSet) {
			Course u =(Course)courses.get(courseNo);
			  String uString = u. getCourseNo()+","+u. getCourseName()+","+u.getCourseGrade();
			  uStringBuffer.append(uString); }
		  putUsersToFile(uStringBuffer.toString(),"course.txt");
	  }
	  private void putUsersToFile(String uString,String osName) {
		  try {
			  FileOutputStream fos = new FileOutputStream(osName);
			  try {
				 fos.write(uString.getBytes("GBK"));
			  }catch(UnsupportedEncodingException e) {
				  e.printStackTrace();
			  }
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	public void delete() {
		System.out.println("请输入要删除的课程代码");
			courseNo = scanner.nextLine();
			System.out.println("请输入要删除的课程名称");
			courseName=scanner.nextLine();
			CourseBiz.jiancha(courseNo,courseName);
			courses.remove(courseNo);
	}
	public void update() {
		 System.out.println("请输入要修改的课程代码：");
		 courseNo = scanner.nextLine();
		 course=(Course)instance.getEntity(courseNo);
			System.out.println("请输入修改后的课程代码：");
			courseNo = scanner.nextLine();
			course.setCourseNo(courseNo);
			System.out.println("请输入修改后的课程名称：");
			courseName=scanner.nextLine();
			course.setCourseName(courseName);
	}
	public HashMap<String, entity.IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}
	public IEntity getEntity(String Id) {
		return courses.get(Id);
	}

}

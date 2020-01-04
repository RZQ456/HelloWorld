package dao;

import entity.IEntity;

import entity.Student;

import java.util.*;



import java.io.*;

public class StudentDao implements IDao {
	private static StudentDao instance=null;
	private static HashMap students=new HashMap();
	private static Student student;
	Scanner scanner = new Scanner(System.in);
	public StudentDao(){
		getUsersFromInputStream("student.txt");	
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
		Student u = new Student();
		u.setStudentNo(userFilelds[0]);
		u.setStudentName(userFilelds[1]);
		u.setStudentGender(userFilelds[2]);
		u.setStudentAge(Integer.parseInt(userFilelds[3]));
		u.setStudentDepartment(userFilelds[4]);
		u.setStudentPassword(userFilelds[5]);
		insert(u);
	}
	public static StudentDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new StudentDao();
					return instance;
				}
			}
		}
		return instance;
	}
	public  Object getStudent(String studentNo){
		 
		  return students.get(studentNo);
	  }
	  public HashMap<String,Student>getStudents(){
		  return students;
	  }
	public void insert(IEntity entity) {
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}
	 public void shuchu() {
		  Set<String> studentSet = students.keySet();
		  StringBuffer uStringBuffer = new StringBuffer();
		  for(String studentNo:studentSet) {
			Student u =(Student)students.get(studentNo);
			  String uString = u. getStudentNo()+","+u. getStudentName()+","+u.getStudentGender()+","+u.getStudentAge()+","+u.getStudentDepartment()+","+u.getStudentPassword()+"\r\n";
			  uStringBuffer.append(uString); }
		  putUsersToFile(uStringBuffer.toString(),"student.txt");
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
		  String guanliyuanPassword="123456"; 
		  System.out.println("请输入管理员密码：");
		  String password = scanner.nextLine();
		  if(guanliyuanPassword.equals(password)) {
			  System.out.println("请输入要删除的学生的学号：");
				String studentNo = scanner.nextLine();
	         students.remove(studentNo);
		  }else {
			  System.out.println("密码错误");
		  }
		}
	public HashMap<String, IEntity> getAllEntities() {
    Set keySet = students.keySet();
     Iterator it =keySet.iterator();
     while(it.hasNext()) {
    	Object key=it.hasNext();
    	Object value =students.get(key);
    	System.out.println(value);
     }
		return null;

	}
 public void update() {
	 System.out.println("请输入要修改信息的学生的学号：");
		String studentNo = scanner.nextLine();
		student = (Student) instance.getEntity(studentNo);
		System.out.println("请输入要修改的密码");
		String studentpasswordUI = scanner.nextLine();
		System.out.println("请再次输入密码：");
		String secondPassword = scanner.nextLine();
		if(studentpasswordUI.equals(secondPassword)) {
		student.setStudentPassword(studentpasswordUI);
 }
		else {
			System.out.println("修改密码失败");
		}
 }
	public IEntity getEntity(String Id) {
		return (IEntity) students.get(Id);
	}
	}
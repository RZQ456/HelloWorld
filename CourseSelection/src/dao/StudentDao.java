package dao;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;
import java.util.*;
import java.io.*;
public class StudentDao implements IDao {

	private static StudentDao instance;
	private HashMap<String, Student> students;
	private Student student;
	public StudentDao(){
		getUsersFromInputStream("user.txt");	
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
		insert(student);
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
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	@Override
	
	 public void update() {
		  Set<String> studentSet = students.keySet();
		  StringBuffer uStringBuffer = new StringBuffer();
		  for(String studentNo:studentSet) {
			Student u =(Student)students.get(studentNo);
			  String uString = u. getStudentNo()+","+u. getStudentName()+","+u.getStudentGender()+","+u.getStudentAge()+","+u.getStudentDepartment()+","+u.getStudentPassword();
			  uStringBuffer.append(uString); }
		  putUsersToFile(uStringBuffer.toString(),"user.txt");
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
			// TODO Auto-generated method stub

		}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return students.get(Id);
	}

}

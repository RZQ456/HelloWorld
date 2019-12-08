package bank;
import java.util.*;
public class DBUtil {
private static DBUtil instance = null;
private TreeMap users = new TreeMap();
private DBUtil(){
	User u1 = new User();
	u1.setCardId("184804111");
	u1.setUserName("张三");
	u1.setCall("17634655716");
	u1.setCardPwd("12345");
	u1.setAccount(1000);
	users.put(u1.getCardId(),u1);
	
	User u2= new User();
	u2.setCardId("184804112");
	u2.setUserName("李四");
	u2.setCall("13693864512");
	u2.setCardPwd("56789");
	u2.setAccount(2000);
	users.put(u2.getCardId(),u2);		
}
  public static DBUtil getInstance() {
	  if(instance==null) {
		//划点
		  synchronized(DBUtil.class) {   
			  if(instance==null) {
			 instance = new DBUtil();
		  }
		 }
	  }
	  return instance;
  }
  public User getUser(String cardId) {
	  return users.get(cardId);
  }
  public TreeMap<String,User>getUsers(){
	  return users;
  }
}

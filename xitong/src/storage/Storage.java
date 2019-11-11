package storage;
import java.util.Random;
public class Storage {
private String []per= new String[100];
private int inpos,outpos;
private int count;
 public Storage() {
	 Random r =new Random(); 
			for(int x=0;x<100;x++)
			{
				per[x]= String.valueOf( r.nextInt(100));
			}
 }
public synchronized void put() {
	try {
		while(count == per.length) {
			this.wait();
		}
	  count++;
		System.out.println(per[inpos]+"�û���¼����ǰ��������Ϊ"+count);
	inpos++;
	if(inpos==per.length)
		inpos=0;
	Thread.sleep(100);
	this.notify();
}catch(Exception e) {
	e.printStackTrace();
}
}
public synchronized void get() {
	try {
		while(count ==0) {
			this.wait();
		}
		 count--;
			System.out.println(per[outpos]+"�û�ע������ǰ��������Ϊ"+count);
  outpos++;
  if(outpos==per.length)
		outpos=0;
	Thread.sleep(100);
	this.notify();
}catch(Exception e) {
	e.printStackTrace();
}
	}
 }

package chuzuche;

public class Text implements Runnable {
 private int per=100;
 public void run() {
	 while(true) {
		 if(per>0) {
			 System.out.println(Thread.currentThread().getName()+"���ڽ��͵�"+per--+"����");
		 }
	 }
 }
}

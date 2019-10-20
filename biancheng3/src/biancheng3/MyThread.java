package biancheng3;

public class MyThread implements Runnable {
 private int biji=80;
 public void run() {
	 while(biji>0) {
		 System.out.println(Thread.currentThread().getName()+"正在发第"+biji--+"份笔记");
	 }
 }
}

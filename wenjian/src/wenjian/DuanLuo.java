package wenjian;

public class DuanLuo implements Runnable{
  private int[]x =new int[55];
  int i=55;
  public void run() {
	  while(true) {
		  if(i>0) {
	  System.out.println(Thread.currentThread().getName()+"正在下载第"+i--+"份段落");
		  }
		  }
  }
}

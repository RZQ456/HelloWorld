package biancheng2;

public class MyThread implements Runnable{
  public void run() {
	  for(int i=0;i<50;i++) {
		  System.out.println("new"+i);
	  }
  }
}

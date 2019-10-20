package biancheng1;

public class MyThread extends Thread{
  public MyThread(String name) {
	  super(name);
  }
  public void run() {
	  while(true) {
	  System.out.println(Thread.currentThread().getName()+"ÔÚÔËÐÐ");
	  }
  }
}

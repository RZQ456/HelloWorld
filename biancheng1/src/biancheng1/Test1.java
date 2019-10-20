package biancheng1;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Thread t1=new MyThread("线程一");
      Thread t2=new MyThread("线程二");
      t1.start();
      t2.start();
	}
}


package biancheng3;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     MyThread my=new MyThread();
     new Thread(my,"老师一").start();
     new Thread(my,"老师二").start();
     new Thread(my,"老师三").start();
     
	}

}

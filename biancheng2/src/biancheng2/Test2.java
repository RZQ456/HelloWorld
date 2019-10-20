package biancheng2;

public class Test2 {

	public static void main(String[] args) {
	MyThread myThread=new MyThread();
	Thread thread=new Thread(myThread);
    thread.start();
    for(int i=0;i<100;i++) {
    	System.out.println("main"+i);
    }
	}

}

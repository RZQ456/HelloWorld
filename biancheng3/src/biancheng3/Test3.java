package biancheng3;

public class Test3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
     MyThread my=new MyThread();
     new Thread(my,"��ʦһ").start();
     new Thread(my,"��ʦ��").start();
     new Thread(my,"��ʦ��").start();
     
	}

}

package biancheng1;

public class Test1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
      Thread t1=new MyThread("�߳�һ");
      Thread t2=new MyThread("�̶߳�");
      t1.start();
      t2.start();
	}
}


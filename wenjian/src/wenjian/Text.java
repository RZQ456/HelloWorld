package wenjian;

public class Text {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    DuanLuo du=new DuanLuo();
    new Thread(du,"�߳�һ").start();
    new Thread(du,"�̶߳�").start();
    new Thread(du,"�߳���").start();
	}

}

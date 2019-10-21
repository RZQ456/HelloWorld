package wenjian;

public class Text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    DuanLuo du=new DuanLuo();
    new Thread(du,"线程一").start();
    new Thread(du,"线程二").start();
    new Thread(du,"线程三").start();
	}

}

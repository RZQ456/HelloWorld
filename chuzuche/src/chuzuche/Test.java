package chuzuche;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         Text te=new Text();
         new Thread(te,"Text1").start();
         new Thread(te,"Text2").start();
         new Thread(te,"Text3").start();
         new Thread(te,"Text4").start();
         new Thread(te,"Text5").start();
	}

}

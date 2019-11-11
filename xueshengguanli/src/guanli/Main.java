package guanli;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    StringBuffer strContainer = new StringBuffer("164801001 张三 男; 164801002 李四 女; 164801003 王五 男;");
    System.out.println("164801001 张三 男; 164801002 李四 女; 164801003 王五 男;");
   System.out.println("增加------");
    Add hh = new Add (strContainer);
    System.out.println("删除------");
    Remove hh1= new Remove(strContainer);
    System.out.println("修改------");
	Alter hh2 =new Alter(strContainer);
	}
}
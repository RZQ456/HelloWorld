package guanli;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    StringBuffer strContainer = new StringBuffer("164801001 ���� ��; 164801002 ���� Ů; 164801003 ���� ��;");
    System.out.println("164801001 ���� ��; 164801002 ���� Ů; 164801003 ���� ��;");
   System.out.println("����------");
    Add hh = new Add (strContainer);
    System.out.println("ɾ��------");
    Remove hh1= new Remove(strContainer);
    System.out.println("�޸�------");
	Alter hh2 =new Alter(strContainer);
	}
}
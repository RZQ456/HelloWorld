package guanli;

public class Alter {
  public Alter(StringBuffer strContainer) {
	  strContainer.replace(10,12,"����");
	  System.out.println(strContainer.toString());
  }
}

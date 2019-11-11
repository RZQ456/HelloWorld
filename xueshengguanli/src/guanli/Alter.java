package guanli;

public class Alter {
  public Alter(StringBuffer strContainer) {
	  strContainer.replace(10,12,"уекд");
	  System.out.println(strContainer.toString());
  }
}

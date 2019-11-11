package guanli;

public class Remove{
	  public Remove(StringBuffer strContainer){
	    strContainer.delete(0,16);
		System.out.println(strContainer.toString());
	  }
	}

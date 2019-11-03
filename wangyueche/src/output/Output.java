package output;
import taxibase.*;
public class Output implements Runnable{
    private TaxiBase ta;
  public  Output( TaxiBase ta){
	   this.ta=ta;
   }
   public void run() {
		  while(true) {
			  ta.go();
		  }
	  }
}

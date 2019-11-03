package input;
import taxibase.*;
public class Input implements Runnable{
  private TaxiBase ta;
  public Input(TaxiBase ta){
	  this.ta=ta;
  }
  public void run() {
	  while(true) {
		  ta.come();
	  }
  }
}

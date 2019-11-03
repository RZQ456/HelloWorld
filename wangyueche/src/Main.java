import taxibase.*;
import input.*;
import output.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
      TaxiBase ta = new TaxiBase();
      Input input =new Input(ta);
      Output output = new Output(ta);
      new Thread(input).start();
      new Thread(output).start();
	}
}

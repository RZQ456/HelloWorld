package factory;
import car.*;

public class BmwFactory implements CarFactory {
   public Car produceCar() {
     return new Bmw();
   }
}

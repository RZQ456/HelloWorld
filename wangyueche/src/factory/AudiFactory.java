package factory;
import car.*;
public class AudiFactory implements CarFactory {
  public Car produceCar() {
  return new Audi();
  }
}

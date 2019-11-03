package factory;
import car.*;
public class BenzFactory implements CarFactory {
public Car produceCar() {
	return new Benz();
}
}

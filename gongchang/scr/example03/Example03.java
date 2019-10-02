package example03;
import animal.*;
import factory.*;
public class Example03{
	public static void main(String[] args){
		Factory factory=new Factory();
		Animal Doger =factory.creatAnimal('d');
		Animal Cater = factory.creatAnimal('c');
	}
}
package factory;
import animal.*;
public class Factory{
	public Animal creatAnimal(char name){
		switch(name){
			case 'd':
			return new Doger();
			case 'c':
			return new Cater();
			default:
			break;
		}
		return null;
	}
}
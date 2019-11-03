package taxibase;
import factory.*;
import car.*;
import utility.*;
public class TaxiBase {
	private Car[] car;
       private int i,inpos,outpos;
       private int count=0;
       public TaxiBase() {
    	   CarFactory carFactory =(CarFactory) XMLUtility.getBean();
    	   for( i=0;i<10;i++) {
    		   car[i]=carFactory.produceCar();
    	   }
    	   }
       public void come() {
    	   try {
    		   while(count==car.length) {
    			   this.wait();
    		   }
    	   System.out.println("����"+i+","+car[i].toString()+"���");
    	   inpos++;
    	   if(inpos==car.length) 
    		   inpos=0;
    	   count++;
    	   Thread.sleep(1000);
        this.notify();
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
       public void go() {
    	   try {
    		   while(count==car.length) {
    			   this.wait();
    		   }
    	   System.out.println("����"+i+ ","+car[i].toString() + "����.�Ʒѷ���" + car[i].getRatio());
    	   outpos++;
    	   if(outpos==car.length) 
    		   outpos=0;
    	   count++;
    	   Thread.sleep(1000);
        this.notify();
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
}

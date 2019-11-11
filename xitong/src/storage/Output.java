package storage;

public class Output implements Runnable{
private Storage st;
public Output(Storage st){
	this.st=st;
}
public void run() {
	while(true) {
		st.get();
	}
}
}

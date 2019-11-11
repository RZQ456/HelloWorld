package storage;

public class Input implements Runnable {
	private Storage st;
	private int num;
	public Input(Storage st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.put();
		}
	}

}

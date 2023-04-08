package Day4.HomeWork;

public class Thread1 extends Thread {
	Count c;

	public Thread1(Count c) {
		this.c = c;
	}

	public void run() {
		c.printNumber(5);
	}

}

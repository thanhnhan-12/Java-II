package Day4.HomeWork;

public class Thread2 extends Thread{
		Count c;
		public Thread2(Count c) {
			this.c=c;
		}
		public void run() {
			c.printNumber(100);
		}

	}


package Day4.HomeWork;

public class Vidu4 extends Thread{
	public void run() {
		System.out.println("Thread "+this.getId()+" has name "+this.getName());

	}

	public static void main(String[] args) {
//      Thiết lập độ ưu tiên

		Vidu4 t0=new Vidu4();
		Vidu4 t1=new Vidu4();
		Vidu4 t2=new Vidu4();
		System.out.println("Thread "+t0.getId()+" has name "+t0.getName()+" priority "+t0.getPriority());
		System.out.println("Thread "+t1.getId()+" has name "+t1.getName()+" priority "+t1.getPriority());
		System.out.println("Thread "+t2.getId()+" has name "+t2.getName()+" priority "+t2.getPriority());
		System.out.println("===========================================================================");
		t0.start();
		t1.start();
		t2.start();
	}
}

package Day4.Chuong04_Thread;

public class Vidu6 extends Thread{
	public void run() {
		System.out.println("Thread "+this.getId()+" has name "+this.getName());

	}

	public static void main(String[] args) {
//      Thiết lập độ ưu tiên

		Vidu6 t0=new Vidu6();
		Vidu6 t1=new Vidu6();
		Vidu6 t2=new Vidu6();
		System.out.println("Thread "+t0.getId()+" has name "+t0.getName()+" priority "+t0.getPriority());
		System.out.println("Thread "+t1.getId()+" has name "+t1.getName()+" priority "+t1.getPriority());
		System.out.println("Thread "+t2.getId()+" has name "+t2.getName()+" priority "+t2.getPriority());
		System.out.println("===========================================================================");
		t0.start();
		t1.start();
		t2.start();
	}
}

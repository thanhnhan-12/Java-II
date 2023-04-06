package Day4.HomeWork;

public class Vidu5 extends Thread{
	public void run() {
		System.out.println("Thread "+this.getId()+" has name "+this.getName()+", priority "+ this.getPriority());

	}
	public static void main(String[] args) {
//      Thiết lập độ ưu tiên
		Vidu5 t0=new Vidu5();
		Vidu5 t1=new Vidu5();
		Vidu5 t2=new Vidu5();
		t0.setPriority(MIN_PRIORITY);
		t1.setPriority(NORM_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
//		System.out.println("Thread "+t0.getId()+" has name "+t0.getName()+" priority "+t0.getPriority());
//		System.out.println("Thread "+t1.getId()+" has name "+t1.getName()+" priority "+t1.getPriority());
//		System.out.println("Thread "+t2.getId()+" has name "+t2.getName()+" priority "+t2.getPriority());
//		System.out.println("===========================================================================");
		t0.start();
		t1.start();
		t2.start();
	}
}


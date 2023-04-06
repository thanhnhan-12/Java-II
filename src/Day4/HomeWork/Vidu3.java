package Day4.HomeWork;

public class Vidu3 extends Thread{
	public void run() {
		System.out.println("");
	}
	public Vidu3(String s) {
		super(s);
	}
	public Vidu3() {
		
	}

	public static void main(String[] args) {
		//Định danh (ThreadID)
		//Định tuyến
		Vidu3 t0=new Vidu3();
		Vidu3 t1=new Vidu3();
		Vidu3 t2=new Vidu3();
		Vidu3 t3=new Vidu3("Third Thread");
		System.out.println("Thread "+t0.getId()+" has name "+t0.getName());
		System.out.println("Thread "+t1.getId()+" has name "+t1.getName());
		System.out.println("Thread "+t2.getId()+" has name "+t2.getName());
		System.out.println("Thread "+t3.getId()+" has name "+t3.getName());

	}

}

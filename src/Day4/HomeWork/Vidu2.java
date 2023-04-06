package Day4.HomeWork;

public class Vidu2 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}
	
//	Tạo một “Thread” bằng cách implements Runnable interface
//	Bước 1    : Tạo một lớp kế thừa (implements) Runnable interface
//	Bước 2    : Ghi đè phương thức “run()” để định nghĩa một nhiệm vụ cụ thể
//	Bước 3.1  : Tạo một đối tượng từ class vừa tạo
//	Bước 3.2  : Tạo đối tượng Thread bằng cách truyền đối số là đối tượng class ở bước 3.1 cho hàm khởi tạo của Thread
//	Bước 4    : Gọi phương thức “start()” để chuyển đối tượng Thread sang chế độ Runnable

	public static void main(String[] args) {
		Vidu2 v2=new Vidu2();
		Thread t2=new Thread(v2);
		t2.start();
		
	}

}

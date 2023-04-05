package Day3.Chuong3;

import java.io.PrintWriter;

public class Vidu2 {

	public static void main(String[] args) {
		//Su dung PrintWriter để viết dữ liệu văn bản
		try {
			PrintWriter pout=new PrintWriter("D:\\VNPT\\JavaNangCao\\DemoVidu\\Chuong3\\Vidu2.txt");
			String name="Nguyen Van A";
			int age=26;
			pout.printf("Hello, My name is %s\nI am %d years old.",name, age);
			pout.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

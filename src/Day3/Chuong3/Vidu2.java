package Day3.Chuong3;

import java.io.PrintWriter;

public class Vidu2 {

	public static void main(String[] args) {
		// Su dung PrintWriter để viết dữ liệu văn bản
		try {
			PrintWriter pout = new PrintWriter("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			String name = "Jurgen Klopp";
			int age = 26;
			pout.printf("Hello, My name is %s\nI am %d years old.", name, age);
			pout.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

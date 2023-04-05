package Day3.Chuong3_IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Vidu1 {

	public static void main(String[] args) {
		// Ví dụ kết hợp FileOutputStream, FileInputStream với DataInputStream,
		// DataOutputStream
		// Viết dữ liệu lên file "Vidu1.txt"
		try {
			FileOutputStream fout = new FileOutputStream("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			String name = "Pep Guardiola";
			String subject = "Java";
			double mark = 9.5;
			dout.writeUTF(name);
			dout.writeUTF(subject);
			dout.writeDouble(mark);
			// Đọc dữ liệu từ file "Vidu1.txt"
			FileInputStream fin = new FileInputStream("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			DataInputStream din = new DataInputStream(fin);
			String name1 = din.readUTF();
			String subject1 = din.readUTF();
			double mark1 = din.readDouble();
			System.out.println(name1);
			System.out.println(subject1);
			System.out.println(mark1);

			dout.close();
			din.close();
		} catch (Exception e) {
			System.out.println("Error!");
		}

	}

}

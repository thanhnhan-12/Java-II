package Day3.Chuong03_IOStream;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.nio.file.StandardCopyOption;

public class Vidu3 {

	public static void main(String[] args) {
		try {
			// Ví dụ sao chép; kiểm tra thông tin file: tồn tại ?, ẩn ?, thư mục ?,...
			// 1. Sao chép: "Vidu2.txt" sang "Vidu3.txt"
			// 1.1 Tạo một file đích
			File destinate = new File("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			Path pdestinate = Paths.get("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			// 1.2 Tạo một file nguồn
			File source = new File("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			Path psource = Paths.get("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");

			// 1.3 Copy
			Files.copy(psource, pdestinate, StandardCopyOption.REPLACE_EXISTING);
			// 1.4 Viet them thong tin
			PrintWriter pout = new PrintWriter("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
			pout.append("Hello");
			pout.close();
			// 2. Kiểm tra sự tồn tại.
			System.out.println("Path exists: " + destinate.exists());
			if (destinate.exists()) {

				// 2.1 Kiểm tra có phải có phải là một folder hay không?
				System.out.println("is Directory: " + destinate.isDirectory());

				// 2.2 Kiểm tra có phải là một đường dẫn ẩn hay không?
				System.out.println("isHidden : " + destinate.isHidden());

				// 2.3 Lấy tên file/ folder
				System.out.println("Simple Name: " + destinate.getName());

				// 2.4 Đường dẫn tuyêt đối.
				System.out.println("Absolute Path: " + destinate.getAbsolutePath());

				// 2.5 Kiểm tra kích thước file:
				System.out.println("Length: " + destinate.length());

				// 2.6 Thời điểm sửa lần cuối
				long lastModify = destinate.lastModified();
				Date lastModifyDate = new Date(lastModify);
				System.out.println("Last modify date: " + lastModifyDate);
				// 3. Nối chuỗi
				PrintWriter pw = new PrintWriter("D:\\TKW\\Batch176\\Java-II\\src\\Day3\\Chuong3\\data1.txt");
				pw.append("Hello");
				pw.append("\nMy name is Trang");
				pw.close();
			}

		} catch (Exception e) {
			System.out.println("Error!");
			e.getStackTrace();
		}

	}

}

package Day3.Chuong02_Stream;

import java.io.PrintWriter;
import java.io.File;

public class Create {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("D:\\Information.txt"));
            String name = "Nguyen Van A";
            String birthday = "01/01/2004";
            String address = "Da Nang";
            pw.write("Hello, my name is " + name + ", I was born on " + birthday + " and I live in " + address);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
}

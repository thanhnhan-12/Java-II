package Day3.Chuong02_Stream;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;
import java.io.FileWriter;

public class CopyAndAdd {
    public static void main(String[] args) {
        try {
            File src = new File("D:\\Information.txt");
            File dest = new File("D:\\InformationNew.txt");

            if (!dest.exists()) {
                System.out.println("File does not exist, creating new file");
                dest.createNewFile();
            }
            
            Path psrc = Paths.get(src.getAbsolutePath());
            Path pdest = Paths.get(dest.getAbsolutePath());

            Files.copy(psrc, pdest, StandardCopyOption.REPLACE_EXISTING);

            PrintWriter pw = new PrintWriter(new FileWriter(dest, true));
            int age = 19;
            String course = "Advanced Java Programming";
            double score = 3.8;
            pw.write("\nI am " + age + " years old, I am studying " + course + " and my expected score is " + score);
            pw.close();

            System.out.println("Containing folder is: " + pdest.getParent());
            System.out.println("Is hidden? " + dest.isHidden() + ", file size = " + dest.length()); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
}

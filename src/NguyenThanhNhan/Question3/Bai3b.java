package NguyenThanhNhan.Question3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai3b {
    public static void createInformationFile(String fileName, String fullName, String placeOfBirth) {
        String content = "Full name: " + fullName + "\nPlace of birth: " + placeOfBirth;
        try {
            String filePath = "D:\\TKW\\Batch176\\Java-II\\src\\NguyenThanhNhan\\Question3\\" + fileName; 
            File file = new File(filePath);
            file.createNewFile();
            java.io.FileWriter writer = new java.io.FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Information file created: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printFileInfo(String fileName) {
        File file = new File(fileName);
        System.out.println("File information: " + fileName);
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Last modified time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
        System.out.println("File size: " + file.length() + " bytes");
    }

    public static void main(String[] args) {
        String fileName = "Information.txt";
        String fullName = "Pep Guardiola";
        String placeOfBirth = "Britain, Manchester City";

        createInformationFile(fileName, fullName, placeOfBirth);
        printFileInfo(fileName);
    }

    
    
}

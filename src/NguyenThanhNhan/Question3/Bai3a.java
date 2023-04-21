package NguyenThanhNhan.Question3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Bai3a {
    public static List<String> listFolderAndFileNames(String folderPath) {
        List<String> folderAndFileNames = new ArrayList<>();

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(folderPath))) {
            for (Path path : directoryStream) {
                folderAndFileNames.add(path.getFileName().toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return folderAndFileNames;
    }

    public static void main(String[] args) {
        String folderPath = "D:\\TKW\\Batch176\\Java-II\\src\\NguyenThanhNhan\\Question3"; 

        List<String> folderAndFileNames = listFolderAndFileNames(folderPath);

        System.out.println("List of the names of subfolders and files in Directory: " + folderPath);

        for (String name : folderAndFileNames) {
            System.out.println(name);
        }
    }

    
}

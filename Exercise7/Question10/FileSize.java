package Exercise7.Question10;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("Exercise7/Question10/Files/2.txt");
        long size = file.length();

        System.out.println("File size: "+size);
    }
}
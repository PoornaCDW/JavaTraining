package Exercise7.Question10;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("Exercise7/Question10/Files/2.txt");
        File renamedFile = new File("Exercise7/Question10/Files/RenamedFile.txt");
        if(file.renameTo(renamedFile))
            System.out.println("The file was successfully renamed!");
        else
        System.out.println("The file was not renamed!");
    }
}
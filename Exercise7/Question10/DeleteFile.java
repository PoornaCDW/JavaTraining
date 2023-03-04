package Exercise7.Question10;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("Exercise7/Question10/Files/1.txt");
        if(file.delete())   
            System.out.println("Deleted.");
        else
            System.out.println("The file wasn't deleted");
    }
}
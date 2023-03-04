package Exercise7.Question11;

import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public static void main(String[] args) {
        File directory = new File("Exercise7");

        if(directory.isDirectory()) {
            String[] fileNames = directory.list();
            Arrays.stream(fileNames).forEach(System.out::println);
        }
    }
}
package Exercise7.Question13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintContents {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("Exercise7/Question13/Hello.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = new String();
            while((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
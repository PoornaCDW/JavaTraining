package Exercise7.Question15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsLine {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("Exercise7/Question15/Contents.txt");
             FileWriter fileWriter = new FileWriter("Exercise7/Question15/CopiedContents.txt") ) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = new String();
            while((string = bufferedReader.readLine()) != null) {
                fileWriter.write(string+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

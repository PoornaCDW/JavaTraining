package Exercise7.Question14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsChar {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("Exercise7/Question14/Contents.txt");
            FileWriter fileWriter = new FileWriter("Exercise7/Question14/CopiedContents.txt")) {
                
                int n=0;
                char[] contents = new char[10];
                while((n=fileReader.read(contents)) != -1) {
                    fileWriter.write(contents, 0, n);
                }
        } catch(IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
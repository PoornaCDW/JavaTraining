package Exercise7.Question12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("Exercise7/Question12/download.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("Exercise7/Question12/Copied.jpg");) {
            byte []imageByte = new byte[1024];
            int byteReads;

            while((byteReads = fileInputStream.read(imageByte)) != -1) {
                fileOutputStream.write(imageByte, 0, byteReads);
            }
            System.out.println("Image has been copied sucessfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Image wasn't copied!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Image wasn't copied!");
            e.printStackTrace();
        }
    }
}
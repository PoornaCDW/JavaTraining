package Exercise7.Question16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ReadAndWriteDate {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Exercise7/Question16/Date.txt")) {
                LocalDateTime localDateTime = LocalDateTime.now();
                String dateString = localDateTime.toString();
                fileWriter.append(dateString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader("Exercise7/Question16/Date.txt")) {
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
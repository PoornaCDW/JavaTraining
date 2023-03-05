package Exercise7.Question9;

import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Enter a string: ");
        string = scanner.nextLine();
        System.out.println(wordCount(string));
        scanner.close();
    }

    public static int wordCount(String string) {
        int wordCount = (int) Arrays.stream(string.split(" ")).count();
        return wordCount;
    }
}
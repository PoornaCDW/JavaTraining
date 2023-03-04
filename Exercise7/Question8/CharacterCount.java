package Exercise7.Question8;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String forCharacter;
        int charCount = 0;
        while(scanner.hasNext()) {
            forCharacter = scanner.next();
            System.out.println((charCount+=forCharacter.length()));
        }
        scanner.close();
    }
}
import java.io.FileReader;

public class Day4_1 {
    public static void main(String[] args){
        throwException();
    }

    public static void throwException(){
        FileReader f = new FileReader("new.txt");
        f.close();
    }
}

/*

When the method throwException() is called the method throws an IOException hence it has to be handled
that can be done by either a try-catch block of throws keyword.

As we aren't using both we get the following error:
Day4_1.java:9: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader f = new FileReader("new.txt");
                       ^
Day4_1.java:10: error: unreported exception IOException; must be caught or declared to be thrown
        f.close();
               ^
2 errors

*/
package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountAlphabets {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        CountAlpha c = new CountAlpha();

        es.execute(()->{
            String s1 = "abc12**bcc";
            synchronized(c) {
                for(int i=0; i<s1.length(); i++) {
                    try{
                        c.countMethod(s1.charAt(i));
                    }catch(NonAlphabeticCharecter e) {
                        System.out.println(e);
                    }
                }
                c.printCount();
            }
        });

        es.execute(()->{
            synchronized(c) {
                c.countAlphabet = 0;
                String s1 = "`22&&(e";
                for(int i=0; i<s1.length(); i++) {
                    try{
                        c.countMethod(s1.charAt(i));
                    }catch(NonAlphabeticCharecter e) {
                        System.out.println(e);
                    }
                }
                c.printCount();
            }
        });

        es.execute(()->{
            synchronized(c) {
                c.countAlphabet = 0;
                String s1 = "opivhbe";
                for(int i=0; i<s1.length(); i++) {
                    try{
                        c.countMethod(s1.charAt(i));
                    }catch(NonAlphabeticCharecter e) {
                        System.out.println(e);
                    }
                }
                c.printCount();
            }
        });
    }   
}

class CountAlpha {
    int countAlphabet;
    
    public void countMethod(char c) throws NonAlphabeticCharecter{
        if(Character.isLetter(c)) {
            countAlphabet++;
        } else {
            throw new NonAlphabeticCharecter("Non alphabetic character entered!");
        }
    }

    public void printCount() {
        System.out.println("The charecter count - "+countAlphabet);
    }

}

class NonAlphabeticCharecter extends Exception {
    String msg;

    NonAlphabeticCharecter(String msg) {
        super(msg);
        this.msg = msg;
    }
}
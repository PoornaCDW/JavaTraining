protected class base {
    String Method() {
        return "Wow";
    }
}

class derived {
    public void useD() {
        base z = new base();
        System.out.println("base says, "+z.Method());
    }
}

public class Day1_25 {
    public static void main(String[] args) {
        
    }
}

/*

The following code throws the error:
Day1_25.java:1: error: modifier protected not allowed here
protected class base {
          ^
1 error

*/
class MyClass {
    private int value;
 
    public MyClass(int value) {
       this.value = value;
    }
 
    public int getValue() {
       return value;
    }
}

public class Day1_17c {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.getValue();
    }
}

/*

If we create a class with a constructor that takes one argument, and 
we try to instantiate an object of that class without providing an 
argument, we will get a compile-time error as follows:

Day1_17c.java:15: error: constructor MyClass in class MyClass cannot be applied to given types;
        MyClass obj = new MyClass();
                      ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error

We can rectify it by:
1. By adding another constructor without any parameter.
2. By passing an argument while creating the object.

*/
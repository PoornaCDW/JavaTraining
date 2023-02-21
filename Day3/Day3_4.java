interface Interface1 {
    void method1a();
    void method1b();
}

interface Interface2 {
    void method2a();
    void method2b();
}

interface Interface3 {
    void method3a();
    void method3b();
}

interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

class MyClass extends SuperClass implements NewInterface {
    public void method1a() {
        System.out.println("Method 1a");
    }
    
    public void method1b() {
        System.out.println("Method 1b");
    }
    
    public void method2a() {
        System.out.println("Method 2a");
    }
    
    public void method2b() {
        System.out.println("Method 2b");
    }
    
    public void method3a() {
        System.out.println("Method 3a");
    }
    
    public void method3b() {
        System.out.println("Method 3b");
    }
    
    public void newMethod() {
        System.out.println("New method");
    }
}

class SuperClass {
    public void superMethod() {
        System.out.println("In superclass method!");
    }
}

public class Day3_4 {
    public static void method1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }
    
    public static void method2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }
    
    public static void method3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }
    
    public static void method4(NewInterface obj) {
        obj.newMethod();
        obj.method1a();
        obj.method1b();
        obj.method2a();
        obj.method2b();
        obj.method3a();
        obj.method3b();
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        method1(obj);
        method2(obj);
        method3(obj);
        method4(obj);
    }
}

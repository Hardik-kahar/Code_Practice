package myapp.core;

class Parent {

    public static void display() {
        System.out.println("Parent static method");
    }

    public static void greet() {
        System.out.println("Parent static static method");
    }

    public void greet1() {
        System.out.println("Parent greet2 instance method");
    }
}

class Child extends Parent {

    public static void display() {
        System.out.println("Child static method");
    }

    public static void greet() {
        System.out.println("Child static static method");
    }

    @Override
    public void greet1() {
        System.out.println("child greet1 instance method111");
    }
}

public class StaticClass {
    public static void main(String[] args) {
//        Child obj = new Child();
        Parent obj = new Child();
        obj.display();
        obj.greet();
        obj.greet1();
//        obj.greet1();

    }
}


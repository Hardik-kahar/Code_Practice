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

// Polymorphism resolved at runtime.In method overriding, the child class provides a specific
// implementation of a method that is already defined in the parent class.
// When an overridden method is called using a parent class reference,
// the child class's method will be executed, even if the reference type is the parent class.

//Compile Time:

//The compiler only checks if the method exists in the reference type (i.e., Parent).
//It ensures that Parent has the method being called (display() in this case). If not, it will throw a compile-time error.

//Runtime:
//At runtime, the JVM resolves the method call based on the actual object type (i.e., Child).
//The overridden method in the child class is invoked, even though the reference type is Parent.

//Why is Dynamic Dispatch Needed?
//Flexibility: Dynamic method dispatch allows Java to support polymorphism,meaning different objects can respond to the same method call differently.
//Code Reusability: It enables you to write code that works with parent references but can be used with multiple child class objects dynamically.

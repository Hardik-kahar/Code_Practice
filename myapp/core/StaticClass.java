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

    @Override
    public void greet1() {
        System.out.println("child greet1 instance method111");
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Parent obj = new Child();

        // This line attempts to assign a Parent instance to a Child reference,
        // which violates the rules of polymorphism in Java.
        // While a Child object can be assigned to a Parent reference (because a Child is a type of Parent), the reverse is not true.
        // A Parent object cannot be treated as a Child object because it might not have the additional properties or
        // behaviors defined in the Child class.
        // Child obj = new Parent();
        obj.display();
        obj.greet();
        obj.greet1();
    }
}

//compile time:     Static methods are resolved at compile-time based on the reference type.
//Run time:         Instance methods are resolved at runtime based on the actual object type.
//A Parent object cannot be assigned to a Child reference. Use the Parent reference for polymorphism.


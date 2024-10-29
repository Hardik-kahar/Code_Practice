package myapp.core;

public class Variable {
    static int sa = 30;
    int a = 20;

    //	public Variable(int aa) {
    //		this.a= aa;
    //		System.out.println(" constructor with parameterize ");
    //	}
    static void fun() {
        class local {
            void fun1() {
                System.out.println("class method fun1>> call....");
            }
        }
        new local().fun1();
    }

    public void student() {
        this.a = 50;
    }

    public Variable() {
        System.out.println("construction call....");
    }

    public void demo() {
        int demo1 = 70;
        System.out.println(" demo:- " + demo1);
    }

    static public void main(String[] args) {
        //new Variable(sa);
        Variable vr = new Variable();
        vr.demo();
        //vr.a=50;
        System.out.println(vr.a);
    }
}

class demo {
    public static void main(String[] args) {

    }
} 



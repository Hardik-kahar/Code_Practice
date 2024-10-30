package myapp.oops;

class Parent {
	public static void m1() {
		System.out.println("Parent");
	}
}
class Child extends Parent {
	public static void m1() {
		System.out.println("Child");
	}
}
public class Poly_methodOverriding1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();

		Child c= new Child();
		c.m1();

		Parent p1 = new Child();
		p1.m1();
	}
}





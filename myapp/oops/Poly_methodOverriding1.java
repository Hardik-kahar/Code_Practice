package myapp.oops;

interface Father {
	public void father() ;

	default void  nature (String name){
		System.out.println("soft");
	}

	default void  nature12 (String name, String name12){
		System.out.println("caring");
	}
}

interface Mother {
	public void mptherNature() ;
}

class Parent implements  Father, Mother {

	@Override
	public void father() {

	}

	@Override
	public void mptherNature() {

	}

	public void m1() {
		System.out.println("Child");
	}
}

class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("Child");
	}
}
public class Poly_methodOverriding1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();

		Child c= new Child();
//		c.m1();

		Parent p1 = new Child();
		p1.m1();
	}
}





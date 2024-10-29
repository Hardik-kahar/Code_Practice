package myapp.opps;

class Animal{}

class Monkey extends Animal{  }

public class Poly_methodOverloading {
	public void m1(Animal a) {
		System.out.println("animal version");
	}
	public void m1(Monkey m) {
		System.out.println("monkey version");
	}

	
	public static void main(String[] args) {
		Poly_methodOverloading p = new Poly_methodOverloading();
		
		Animal animal = new Animal();
		p.m1(animal);
		
		Monkey m = new Monkey();
		p.m1(m);
		
		Animal animal2 = new Monkey();
		p.m1(animal2);
	}
}

package myapp.opps;

class P{
	public void property() {
		System.out.println("GOLD | LAND | CASH");
	}
	public void marry(){
		System.out.println(" parent :- Appalamma| subbalumai");
	}
}
class C extends P{
	public void marry() {
		System.out.println("child method :- Katrina");
	}
}

public class Poly_methodOverriding {
	public static void main(String[] args) {
		P p = new P();
		p.marry();
		
		C c = new C();
		c.marry();
		//most important case
		P p2= new C();
		p2.marry(); 
	}
}

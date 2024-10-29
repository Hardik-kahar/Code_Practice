package myapp.core;

class person{
	String name;
	int id;
	int PhoneNo;
	public person(int id, String name, int phno) {
		this.id = id;
		this.name = name;
		this.PhoneNo = phno;
	}
}
class emplayee extends person{
	int salary;
	public emplayee(int id, String name, int phno, int sal) {
		super(id, name, phno);
		this.salary = sal;
	}
	public void display() {
		System.out.println(id + name + salary );
	}
	void d1() {
		System.out.println("**");
	}
}

public class Use_Super {
	emplayee em= new emplayee(1, "nitin ", 3000, 30);
//	em.display();  // why not working
}

package myapp.core;

class Student{  
	int rollno=20;  
	String name;  
	float fee;

	Student(){}
	Student(String name,float fee){  
		this.name=name;  
		this.fee=fee;  
	} 
	Student(int ro,String name,float fee){  
		this("nitin",400); // called two paramitrized construtor
		this.rollno= ro;  
	}  
	//void display(){System.out.println(rollno+" "+name+" "+fee);}  

	//5
	This_Super ts; 
	Student( This_Super ts){
		this.ts= ts;
	}
	void display() {  
		System.out.println(" 5) this: to pass as argument in the constructor call");
	}
	
	// 6
	int a;
	Student getStudent(int a) { // Student is return time ,   getStudent is method
		this.a = a+a;  // we can use as a conditional statement  like incapsulation 
		return this;  
	}
	void msg() { System.out.println( a+ "  Hello java " );}
}  

public class This_Super {
	int data = 10;
	public static void main(String args[]){  
//		Student s1=new Student(111,"ankit",5000f); 
//		s1.display();  
//		This_Super ts = new This_Super();   //4
//		ts.m();    //4
//		new This_Super();   //5
		new Student().getStudent(10).msg();  //6
	}
	
	//4
	void m() {
		this.p(this);
		System.out.println("m tun....");
	}
	void p(This_Super sn) {
		System.out.println("p run.....");
	}

	//5
	void display() {System.out.println(" ");}
	This_Super(){    
		Student st= new Student();
		st.display();
	}
	
	
}
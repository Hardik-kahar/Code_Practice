package myapp.oops;

class human {
	
	
	void waking() {
		String style = "simple";
	}
	void behaviur() {
		String behav="good";
	}
	
	//constructor  
	
	
	// toString() method to print info
	
}

class student extends human  {
	
	//
	public student(int l, int e,int id, String name) {
		// TODO Auto-generated constructor stub
	}

	int id ;
	String name ;
	
	public void setid (int newvalue) {
		id = newvalue;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
}

public class Inheritance_Opps {

	public static void main(String[] args) {
		
	}
	
}
package myapp.opps;

class Operation{  
	int square(int n){  
		return n*n;  
	}  
}  

class Inheritance_1 //extends Operation
{  
	//Operation op;//aggregation  
	double pi=3.14;  

	double area(int radius){  
		Operation op =new Operation();  
		int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
		return pi*rsquare;  
	}  

	public static void main(String args[]){  
		Inheritance_1 c=new Inheritance_1();  
		double result=c.area(5);  
		System.out.println(result);  
	}  
}  

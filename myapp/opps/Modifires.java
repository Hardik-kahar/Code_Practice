package myapp.opps;

public class Modifires {

	static public class puclass{
		int a=3;
		
	static public class Sub_puclass{
		int b=5;
			
			static	public int sub_method() {
				int c=5;
				return c;
			}
		}
	}
	
	public class Pubclass{
		int a=3;

		public int sub_method() {
			int c=500;
			return c;

		}
	}
	
	private class privateclass{
		int a1= 12;
		class private_puclass{
			int b1 =12;
			
		}
	}
	
	class defaultclass {
		int a2= 20;
		class default_puclass{
			int b2= 20;	
		}
	}
	
	protected class pretectedclass{
		int a3= 40;
		class protected_puclass{
			int b3= 40;
		}
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

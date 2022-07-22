package Programs;

class Calculations{
	
    int multiply(int x, int y) {
    	return x*y;
    }
    void addition(int x, int y, int z) {
    	System.out.println( x+y+z);
    }
    
}



public class methods {

	public static void main(String[] args) {
		 System.out.println("Methods");
		 int result =0;
		 Calculations c =new Calculations();
		 result = c.multiply(12, 6);
		 System.out.println( "Multiplication of two numbers is " + result);
		 System.out.println( "Addition of two numbers is :");
		 c.addition(6, 800, 4);

	}

}

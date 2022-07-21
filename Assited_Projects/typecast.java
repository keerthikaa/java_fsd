package Programs;

public class typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit typecast");
		int a=10;
        float b=a; 
        long l=a ;
        double d = a;
        System.out.println("Float " + b);
        System.out.println("Long " +l);
        System.out.println("Double " +d);
        
        System.out.println("Explicit typecast");
        double x =10.00d;
        int y = (int)x;
        System.out.println("int " + y);
	}

}

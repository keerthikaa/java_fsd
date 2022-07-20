package com;

/*final class A 
 * we can not inherit the B class 
 * because the class is final */
 class A 
{
	/*public final void disp() 
	 * if there is a final method in a super class
	 * we can not override in sub class*/
		 void disp() {
		System.out.println("method a");
	}
}
class B extends A{
	/* void disp() {
	 * final method can not be overridden */
		void disp() { 
		System.out.println("method B");
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=19;
   System.out.println(a);
   final int b=19;
   //can not change final b value
  //  b =23; 
     B bb= new B();
     bb.disp();
     A aa =new A();
     aa.disp();
     System.out.println(b);
	}

}

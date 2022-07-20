package com;

class Operation{
	  public void area(int r) {
		  int rad;
		  rad = r;
		  System.out.println( 3.14 * rad *rad);
	  }
	  public void area(int h , int b) {
		  System.out.println( 0.5 * h *b);
	  }
}
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Operation op = new Operation();
      op.area(5);
      op.area(12,5);
	}

}

package com;

abstract class vehicle{
	abstract void speed();
	void milage() {
		System.out.println("65");
	}
}

class bmw extends vehicle{
	void speed() {
		System.out.println("56 km/hr");
	}
}

 
public class Abstractfinal_static {
  public static void main(String[] args) {
	  //can not create object for abstract class
	  //bike bb=new bike();
	  bmw hh=new bmw();
	  hh.speed();
	  hh.milage();
  }
}

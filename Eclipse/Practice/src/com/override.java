package com;

class Bike {
    public void speed() {
        System.out.println("60km/hr");
    }
}
class Honda extends Bike {
    public void color() {
        System.out.println("Black");
    }
}
class Pulsar extends Bike {
	//method overriding here
	//when we do not like the superclass method
	// we overwrite the superclass method : that is overriding
	//inheritance is mandatory here
    public void speed() {
        System.out.println("100km/hr");
    }
    public void color() {
        System.out.println("Red");
    }
    
    }
class Tvs extends Bike {
	public void speed() {
		super.speed();
        System.out.println("100km/hr");
    }
    public void color() {
        System.out.println("Gray");
    }
}

public class override {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Honda hh = new Honda();    
		 hh.color();     
		 hh.speed();
		  Pulsar pu = new Pulsar();  
		  pu.color(); 
		  pu.speed();
		  Tvs tv = new Tvs();
		  tv.color();
		  tv.speed();}

	}

package test;

public class TestAnimal {
	
	public static void main ( String [] args ){
		
		Animal d = new Dog () ;		
		d.name = "puppy" ;
		d.tall = 100 ;
		d.weight = 40 ;
		d.bark();
		
		System.out.println();
		
		Machine m = new Dog () ;
		m.bark();
		m.light();
		
		
		
		
	}

}

package test;

public class Dog extends Animal implements Machine {

	
	public String name = Machine.name ;
	
	
	public double tall = Machine.tall ;
	public double weight = Machine.weight ;
	
	
	@Override
	public void light() {
		System.out.println("I cant light !");	
	}

	@Override
	public void bark() {		
		System.out.println("汪! 汪! 汪!");		
	}
	

}

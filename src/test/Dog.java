package test;

public class Dog extends Animal {
	
	private String type ;
	
	public Dog (String name , int weight , String type){
		super(name , weight);		//這個要寫在建構子的第一行
		this.type = type ;
	}
	
	
	
}

package test;

public class TestEseasons {

	public static void main(String[] args) {
		show (ESeasons.SUMMER) ;
	
	}
	
	public static void show (ESeasons s){
		switch (s){
			case SPRING :
				System.out.println("Spring");
				break ;
				
			case SUMMER :
				System.out.println("Summer");
				break ;
				
			case FALL :
				System.out.println("Fall");
				break ;
				
			case WINTER :
				System.out.println("Winter");
				break ;
		}
	}
}

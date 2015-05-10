package test;

public enum ESeasons {
	//列舉項目要放置第一行
	SPRING('春'),SUMMER('夏'),FALL('秋'),WINTER('冬');

	private char chName ;	
	
	//建構子使用private屬性
	private ESeasons (char chName){
		this.chName = chName ;
	}
	
	public char getChineseName (){
		return chName ;
	}
	
	@Override
	public String toString (){
		return chName + "季" ;
	}
}


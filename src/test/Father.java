package test;

public class Father { 
private	int money=50000;  
	
	public int getMoney(int m) {
		money=money-m;
		return m;
	}
	public void prt() {
		System.out.println("Father money:"+money);
	}
	
	
	

}

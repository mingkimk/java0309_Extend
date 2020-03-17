package test;

public class Me extends Father {

	int myMoney = 20000;

	Me() {
		super();// 상속 받은 클래스의 생성자
	}

	public void getMoney() {
		int newM = super.getMoney(500);
		myMoney = myMoney + newM;
	}

	public void myMoney() {
		System.out.println(" 내 돈은: " + this.myMoney);
		super.prt();
	}

}

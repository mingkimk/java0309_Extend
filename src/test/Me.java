package test;

public class Me extends Father {

	int myMoney = 20000;

	Me() {
		super();// ��� ���� Ŭ������ ������
	}

	public void getMoney() {
		int newM = super.getMoney(500);
		myMoney = myMoney + newM;
	}

	public void myMoney() {
		System.out.println(" �� ����: " + this.myMoney);
		super.prt();
	}

}

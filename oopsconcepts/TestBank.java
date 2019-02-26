package oopsconcepts;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.loan();
		b.transferMoney();
		
		System.out.println(USBank.min_bal);
		
		USBank u = new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();		
		
	}

}

package CODE.Banking;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCusDetails p1 = new BankCusDetails(1,"Brami","Savings","Union Bank","9390592383",100);
		p1.displayInfo();
		System.out.println();
		
		p1.deposit(100);
		System.out.println("Total Balance : "+p1.totalBal());
		
		p1.withdraw(150);
	}

}


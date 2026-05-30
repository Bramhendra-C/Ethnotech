package CODE.Banking;

public class BankUpdates extends BankCusDetails {
	protected String AccountStatus;

	BankUpdates(int cusId , String Name, String AccType,String BankName,String MobNum, int bal, String AccStatus,int balance) {
		super(cusId, Name, AccType, BankName, MobNum, balance);
		this.AccountStatus = AccStatus;
		this.Balance = balance;
	}
	
	void displayInfo() {
		System.out.println("Bank Employee is Accesesing , " +this.Name + "'s Account");
		super.displayInfo();
		System.out.println("Account Status : "+this.AccountStatus);
	}
	
}

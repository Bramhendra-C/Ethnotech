package CODE.Banking;

public class Manager extends BankCusDetails{
	protected boolean loans;
	
	Manager(int cusId , String Name, String AccType,String BankName,String MobNum, int bal , boolean loans) {
		super(cusId, Name, AccType, BankName, MobNum, bal);
		this.loans = loans;
	}
	
	void displayInfo() {
		System.out.println("Manager is Accesesing , " +this.Name + "'s Account");
		super.displayInfo();
		System.out.println(this.Name + " this person having Loans : "+(this.loans ? "Yes" : "No"));
	}
}

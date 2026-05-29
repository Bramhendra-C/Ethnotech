package CODE.Banking;

public class BankCusDetails {
	protected int customerid;
	protected String Name;
	protected String Accounttype;
	protected String BankName;
	protected String MobileNumber;
	protected float Balance;
	
	BankCusDetails(int cusId , String Name, String AccType,String BankName,String MobNum, float bal) {
		this.customerid = cusId;
		this.Name = Name;
		this.Accounttype = AccType;
		this.BankName = BankName;
		this.MobileNumber = MobNum;
		this.Balance = bal;
		System.out.println(this.Name + " is Account Opened Succsesfully!...");
	}
	
	void displayInfo() {
		System.out.println("Customer ID : "+this.customerid);
		System.out.println("Customer Name : "+this.Name);
		System.out.println("Customer Account type : "+this.Accounttype);
		System.out.println("Customer Bank Name : "+this.BankName);
		System.out.println("Customer Mobile Number : "+this.MobileNumber);
	}
	
	void HisAcc() {
		System.out.println(this.Name + " this person open his bank in " + this.BankName);
	}

	float totalBal() {
		return this.Balance;
	}
	
	boolean withdraw(float amt) {
		if(amt <= this.Balance) {
			this.Balance -= amt;
			System.out.println("Succesefully withdrawn amount in your account \nAvailable Balance : "+this.Balance);
			return true;
		}
		System.out.println("Inefficient funds in your "+this.BankName+" account!....");
		return false;
	}
	
	float deposit(float amt) {
		this.Balance += amt;
		System.out.println("Succsesfully deposited amount in your "+this.BankName+" Account!...");
		return this.Balance;
	}
}


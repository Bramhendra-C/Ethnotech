package CODE;

class BankBal {
	
	public static void main(String[] args) {
		BankBal bank = new BankBal();
		bank.setBal(100);
		System.out.println("Bank Balance : "+ bank.getBal());
	}
	
	private int bal;
	
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	public int getBal() {
		return bal; 
	}

}


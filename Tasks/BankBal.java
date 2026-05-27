package CODE;

class BankBal {
	
	public static void main(String[] args) {
		BankBal bank = new BankBal();
		bank.setId(100);
		System.out.println("Bank Balance : "+ bank.getId());
	}
	
	private int bal;
	
	public void setId(int bal) {
		this.bal = bal;
	}
	
	public int getId() {
		return bal; 
	}

}


package CODE.Polymorphism;

interface UPI{
	void UpiPayment();
}

interface Cash{
	void CashPayment();
}

class payment implements UPI , Cash {
	@Override
	public void UpiPayment() {
		System.out.println("UPI payment11");
	}
	@Override
	public void CashPayment() {
		System.out.println("Cash Payment");
	}
}

class payments implements UPI , Cash {
	payment pay = new payment();
	@Override
	public void UpiPayment() {
		System.out.println("UPI payment");
	}
	@Override
	public void CashPayment() {
		System.out.println("Cash Payment");
	}
}

public class polymorphismExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		payments pays = new payments();
		pays.pay.UpiPayment();
		pays.CashPayment();
	}

}

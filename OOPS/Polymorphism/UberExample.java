package CODE.Polymorphism;

abstract class bookings{
	public abstract void booking(int have);
}
class bike extends bookings{
	@Override
	public void booking(int have) {
		int price = 80;
		if(price <= have) {
			System.out.println("Bike is booked for you!....");
		}
		else {
			System.out.println("Bike is to expensive");
		}
	}
}
class cab extends bookings{
	@Override
	public void booking(int have) {
		// TODO Auto-generated method stub
		int price = 250;
		if(price <= have) {
			System.out.println("Cab is booked for you!....");
		}
		else {
			System.out.println("Cab is to expensive");
		}
	}
}

class auto extends bookings{ 
	@Override
	public void booking(int have) {
		// TODO Auto-generated method stub
		int price = 150;
		if(price <= have) {
			System.out.println("Auto is booked for you!....");
		}
		else {
			System.out.println("Auto is to expensive");
		}
	}

}
public class UberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike book = new bike();
		book.booking(100);
		cab car = new cab();
		car.booking(100);
		auto auto = new auto();
		auto.booking(100);
	}

}

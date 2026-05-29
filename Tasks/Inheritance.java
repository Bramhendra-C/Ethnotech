package CODE;

class father{
	void fathersay() {
		System.out.println("Helo son!");
	}
}

class son extends father{
	void sonsay() {
		System.out.println("Yes dad!");
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
		son cl = new son();
		cl.fathersay();
		cl.sonsay();
	}

}


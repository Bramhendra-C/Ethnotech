package CODE;

public class Encapsulation {

	public static void main(String[] args) {
		Encapsulation encp = new Encapsulation();
		encp.setId(101);
		System.out.println(encp.getId());
	}
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}		
}

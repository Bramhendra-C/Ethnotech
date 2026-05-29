package CODE;

class EmployeeID{
	private int id;
	void setEmployeId(int id) {
		this.id = id;
	}
	int GetId() {
		return id;
	}
}

class Salary extends EmployeeID{
	private float salary;
	void SetSalary(float salary) {
		this.salary = salary;
	}
	float GetSalary() {
		return salary;
	}
}

class EmployeeNameRole extends Salary{
	private String name;
	private String Role;
	void setEmployeNameRole(String name , String Role) {
		this.name = name;
		this.Role = Role;
	}
	String[] GetNameRole() {
		return new String[] {name , Role};
	}
}


public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeNameRole set1 = new EmployeeNameRole();
		set1.setEmployeId(1);
		set1.setEmployeNameRole("Bramii","Java Dev");
		set1.SetSalary(9000000);
		String[] details = set1.GetNameRole();
		System.out.println("Employee ID : "+set1.GetId()+"\nEmployee Name : "+details[0]+"\nEmployee Role : "+details[1]+"\nEmployee salary : "+set1.GetSalary());
		System.out.println();
		
		EmployeeNameRole set2 = new EmployeeNameRole();
		set2.setEmployeId(2);
		set2.setEmployeNameRole("Bramii 2.0","Python Dev");
		set2.SetSalary(2400000);
		details = set2.GetNameRole();
		System.out.println("Employee ID : "+set2.GetId()+"\nEmployee Name : "+details[0]+"\nEmployee Role : "+details[1]+"\nEmployee salary : "+set2.GetSalary());
		System.out.println();
		
		EmployeeNameRole set3 = new EmployeeNameRole();
		set3.setEmployeId(3);
		set3.setEmployeNameRole("Bramii 3.0","Tester");
		set3.SetSalary(2300000);
		details = set3.GetNameRole();
		System.out.println("Employee ID : "+set3.GetId()+"\nEmployee Name : "+details[0]+"\nEmployee Role : "+details[1]+"\nEmployee salary : "+set3.GetSalary());
	}

}

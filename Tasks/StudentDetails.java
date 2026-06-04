package CODE.Tasks;
//Sudent enites....
import java.util.*;
public class StudentDetails {
	
	public static void main(String[] args) {
		List<String[]> student = new ArrayList<>();
		student.add(new String[] {"1","Brami","CST","MITS","9390"});
		student.add(new String[] {"2","Revanth","CST","MITS","3456"});
		student.add(new String[] {"3","Bharath","CSE","MITS","1234"});
		student.add(new String[] {"4","Harsha","CSN","MITS","2345"});
		student.add(new String[] {"5","Hemanth","CSD","MITS","5432"});
		student.add(new String[] {"6","Acharii","ECE","MITS","0987"});
		for(String[] row : student) {
			System.out.println(Arrays.toString(row));
		}
	}

}

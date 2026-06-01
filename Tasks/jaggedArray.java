package CODE.Tasks;

public class jaggedArray {

	public static void main(String[] args) {
		int[][] marks = new int[3][0];
		marks[0] = new int[4];
		marks[1] = new int[7];
		marks[2] = new int[5];
		
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				marks[i][j] = (marks.length - i) * (5 + j);
			}
		}
		
		print(marks);
		
	}
	static void print(int[][] marks) {
		for(int[] row : marks) {
			for(int ele : row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}

}

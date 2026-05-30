package CODE.Tasks;

public class temp {
	//Basics Operations on Array ele like temp
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {28,29,30,35,40,45,30,30,30,23,34,28,29,36,38,26,46,23,24,25,31,23,24,31,32,34,35,32,32,38};
		int minTemp = arr[0];
		int maxTemp = arr[0];
		int avg = 0 , highTemp = 0;
		for(int ele : arr) {
			minTemp = Math.min(minTemp, ele);
			maxTemp = Math.max(maxTemp, ele);
			avg += ele;
			if(ele >= 35) highTemp++;
		}
		System.out.println("Minimum temp : "+ minTemp + "\nMax Temp : " + maxTemp + "\navg temp : "+ (avg / 30) + "\nHot days conut : " + highTemp);
		
	}

}

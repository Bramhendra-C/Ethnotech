package CODE.Tasks;
import java.util.*;
public class ArrayListtOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Add song");
		System.out.println("2. remove Song");
		System.out.println("3. Size songs");
		System.out.println("4. print songs");
		System.out.println("5. check playlist is empty");
		System.out.println("6. sort all songs");
		System.out.println("7. reverse all songs");
		System.out.println("8. rondam songs allocation");
		System.out.println("9. Play list contains song or not");
		System.out.println("10. exit");
		
		
		ArrayList<String> playlist = new ArrayList<>();
		while(true) {
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			System.out.println();
			
			String song;
			switch (choice) {
				case 1:
					System.out.print("Enter song name : ");
					song = input.next();
					playlist.add(song);
					break;
				case 2:
					System.out.print("Enter song name : ");
					int ind = input.nextInt();
					playlist.remove(ind);
					break;
				case 3:
					System.out.println("Playlist size : " + playlist.size());
					break;
				case 4:
					System.out.println("play list : " + playlist);
					break;
				case 5:
					System.out.println("Check if playlist is empty : " + playlist.isEmpty());
					break;
				case 6:
					Collections.sort(playlist);
					System.out.println("play list : " + playlist);
					break;
				case 7:
					Collections.reverse(playlist);
					System.out.println("Play list : " + playlist);
					break;
				case 8:
					Collections.shuffle(playlist);
					System.out.println("Play list : " + playlist);
					break;
				case 9:
					System.out.print("Enter song name : ");
					song = input.next();
					System.out.println("Play list have song or not : " + playlist.contains(song));
				case 10:
					return;
				
				default :
					System.out.println("Eneter valid option (1 - 10)");
					break;
			}
 		}
	}

}

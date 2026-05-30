package CODE.Swiggy;

import java.util.Scanner;
public class Swiggy {
	static User user;
	static Admin admin;
	static server server;
	public static void main(String[] args) {
		menuu menu = new menuu();
		// TODO Auto-generated method stub
		menu.displayMenu();
		Scanner input = new Scanner(System.in);
		
		
		
		
		server = new server();
		while(true) {
			System.out.println("1. User");
			System.out.println("2. Admin");
			System.out.println();
			
			String item;
			switch(input.nextInt()) {
				case 1:
					registerUser(input,menu);
					System.out.println("1. Update address");
					System.out.println("2. update name");
					System.out.println("3. Add order");
					System.out.println("4. Remove order");
					System.out.println("5. Display Cart");
					System.out.println("6. Confirm order");
					System.out.println("7. Display History");
					System.out.println("8. Exit");
					
					boolean condition = true;
					while(condition) {
						System.out.print("Which option : ");
						int choice = input.nextInt();
						System.out.println();
						switch(choice) {
							case 1:
								user.updateAddress(input.next());
								break;
							case 2:
								user.updateName(input.next());
								break;
							case 3:
								System.out.print("Enter item name : ");
								item = input.next();
								user.Addorder(item.toLowerCase());
								break;
							case 4:
								System.out.print("Enter item name : ");
								item = input.next();
								user.removeOrder(item.toLowerCase());
								break;
							case 5:
								user.displayCart();
								break;
							case 6:
								System.out.print("Payment status : ");
								user.confirmOrders(input.nextBoolean());
								admin.updateInfo();
								break;
							case 7:
								server.displayHistory(user.userId);
								break;
							case 8:
								System.out.println("Exiting User!...");
								condition = false;
							default :
								System.out.println("Invalid Option!..");
								break;
						}
						System.out.println();
					}
					break;
				
				case 2:
					registerAdmin(input,menu);
					System.out.println("1.Display info");
					System.out.println("2. Add item");
					System.out.println("3. Remove Item");
					System.out.println("4. Exit");
					
					condition = true;
					while(condition) {
						System.out.print("Which option : ");
						int choice = input.nextInt();
						System.out.println();
						switch(choice) {
							case 1:
								admin.displayUsers();
								break;
							case 2:
								System.out.print("Enter item name : ");
								item = input.next();
								System.out.print("Eneter item price : ");
								int price = input.nextInt();
								admin.AddItem(item, price);
								break;
							case 3:
								System.out.print("Enter item name : ");
								item = input.next();
								admin.RemoveItem(item);
								break;
							case 4:
								System.out.println("Exiting from Admin!...");
								condition = false;
								break;
							default :
								System.out.println("Invalid option!..");
								break;
						}
						System.out.println();
					}
				default :
					return;
			}
		}
	}
	static void registerUser(Scanner input, menuu menu) {
		System.out.print("Enter ID : ");
		int id = input.nextInt();
		System.out.print("\nEnter Name : ");
		String name = input.next();
		System.out.print("\nEnter Address : ");
		String Address = input.next();
		System.out.print("\nEnter Mobile Number : ");
		String num = input.next();
		System.out.println();
		
		user = new User(id,name,Address,num,menu);
	}
	static void registerAdmin(Scanner input, menuu menu) {
		System.out.print("Enter ID : ");
		int id = input.nextInt();
		System.out.print("\nEnter Name : ");
		String name = input.next();
		System.out.print("\nEnter Address : ");
		String Address = input.next();
		System.out.print("\nEnter Mobile Number : ");
		String num = input.next();
		System.out.println();
		admin = new Admin(id,name,Address,num,menu);
	}
	


}

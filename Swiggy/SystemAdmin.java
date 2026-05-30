package CODE.Swiggy;

import java.util.HashMap;
import java.util.Map;

class menuu{
	//View menu items
	public HashMap<String , Integer> menu = new HashMap<>();
	menuu() {
		menu.put("chickenbiryani",120);
		menu.put("eggbiryani",100);
		menu.put("vegbiryani",90);
		menu.put("muttonbiryani",180);
		menu.put("pizza",250);
		menu.put("chickenmandi",500);
		menu.put("dumbiryani",150);
		menu.put("magii",50);
		menu.put("icecream",60);
		menu.put("snacks",80);
		menu.put("cooldrinks",100);
	}
	void displayMenu() {
		System.out.println("------ Menu ------");
		int cnt = 1;
		for (Map.Entry<String, Integer> entry : menu.entrySet()) {
		    System.out.println("Item "+ cnt++ + " : " + entry.getKey() + ", Price : " + entry.getValue());
		}
		System.out.println();
	}
	
	void addItem(String item , int price) {
		if(!menu.containsKey(item)) {
			System.out.println(item + " , Added to menu success!..");
			menu.put(item,price);
		}
		else {
			System.out.println(item + " is already exists!..");
		}
	}
	void removeItem(String item) {
		if(menu.containsKey(item)) {
			System.out.println("Removed "+ item +" from menu success!..");
			menu.remove(item);
		}
		else System.out.println("Item doesn't exixt!..");
	}
}

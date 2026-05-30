package CODE.OnlineOrdersFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class server {

    public HashMap<Integer, User> users =
            new HashMap<>();

    public HashMap<Integer, ArrayList<String>> orders =
            new HashMap<>();

    private HashMap<String, Integer> menu =
            new HashMap<>();

    private int totalRevenue = 0;

    public server() {
        loadMenu();
    }

    private void loadMenu() {
        menu.put("chickenbiryani", 120);
        menu.put("eggbiryani", 100);
        menu.put("vegbiryani", 90);
        menu.put("muttonbiryani", 180);
        menu.put("pizza", 250);
        menu.put("chickenmandi", 500);
        menu.put("dumbiryani", 150);
        menu.put("maggi", 50);
        menu.put("icecream", 60);
        menu.put("snacks", 80);
        menu.put("cooldrinks", 100);
    }

    public void registerUser(User user) {

        users.put(user.getId(), user);

        System.out.println(user.getName() + " Registered Successfully");
    }

    // Method Overloading
    public void registerUser(int id,String name) {
        User user = new User(id, name);
        registerUser(user);
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public void displayMenu() {
        System.out.println("\n------ MENU ------");
        int count = 1;
        for(Map.Entry<String, Integer> item : menu.entrySet()) {

            System.out.println(count++ + ". " + item.getKey() + " - " + item.getValue());
        }
    }

    public void userAddItem(int id,String item) {

        if(!menu.containsKey(item)) {
            System.out.println(item  + " Not Available");
            return;
        }

        orders.computeIfAbsent(id, k -> new ArrayList<>()).add(item);
    }

    // Method Overloading
    public void userAddItem(int id, String item, int quantity) {

        for(int i = 0;i < quantity;i++) {
            userAddItem(id, item);
        }
    }

    public void userRemoveItem(int id,String item) {
        if(orders.containsKey(id)) {
            orders.get(id).remove(item);
        }
    }

    public void removeCart(int id) {
        if(orders.containsKey(id)) {
            orders.get(id).clear();
        }
    }

    public void generateBill(int id) {
        if(!orders.containsKey(id) || orders.get(id).isEmpty()) {
            System.out.println("Cart Empty");
            return;
        }

        int total = 0;
        System.out.println("\n------ BILL ------");

        int count = 1;
        for(String item : orders.get(id)) {
            System.out.println(count++ + ". " + item + " - " + menu.get(item));
            total += menu.get(item);
        }

        System.out.println("Total Bill : " + total);
    }

    public void confirmOrder(int id, boolean payment) {

        if(payment) {
            int bill = 0;
            for(String item : orders.get(id)) {
                bill += menu.get(item);
            }

            totalRevenue += bill;
            System.out.println("Payment Successful");
            generateBill(id);
            System.out.println("Order Confirmed");
        }
        else {
            System.out.println("Payment Failed");
        }
    }

    public int getRevenue() {
        return totalRevenue;
    }
}
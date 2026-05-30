package CODE.OnlineOrdersFood;

public class main {

    public static void main(String[] args) {

        server server = new server();

        server.displayMenu();

        User u1 = new User(1, "Brami");
        User u2 = new User(2, "Brami 2.0");

        server.registerUser(u1);
        server.registerUser(u2);

        // Overloaded method
        server.registerUser(3,"Brami 3.0");

        u1.displayRole();
        u2.displayRole();

        server.userAddItem(1,"chickenbiryani");
        server.userAddItem(1, "pizza",2);
        server.userAddItem(1,"snacks");
        server.userAddItem(2,"muttonbiryani");
        server.userAddItem( 2,"icecream",2);
        server.confirmOrder(1,true);
        System.out.println();
        server.confirmOrder(2,false);
        System.out.println();
        
        Admin admin = new Admin(100,"SuperAdmin", server);
        admin.displayRole();
        admin.displayUsers();
        admin.displayUserInfo(1);
        
        System.out.println();
        admin.displayRevenue();
    }
}
package CODE.OnlineOrdersFood;

public class Admin extends person {

    private server server;

    public Admin(int id, String name, server server) {
        super(id, name);
        this.server = server;
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Admin");
    }

    public void displayUsers() {
        System.out.println("\n------ USERS ------");
        for(User user : server.users.values()) {
            System.out.println("ID : " + user.getId() + " Name : " + user.getName());
        }
    }

    public void displayUserInfo(int id) {

        User user = server.getUser(id);
        if(user == null) {
            System.out.println("User Not Found");
            return;
        }
        System.out.println("\nUser Details");
        System.out.println("ID : " + user.getId());
        System.out.println("Name : " + user.getName());
        if(server.orders.containsKey(id)) {
            System.out.println("Orders : " + server.orders.get(id));
        }
    }

    public void displayRevenue() {
        System.out.println("Total Revenue : " + server.getRevenue());
    }
}
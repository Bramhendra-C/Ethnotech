package CODE.OnlineOrdersFood;

public class User extends person {

    public User(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Customer");
    }
}
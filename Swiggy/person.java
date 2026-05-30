package CODE.OnlineOrdersFood;

public abstract class person {

    protected int id;
    protected String name;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void displayRole();
}
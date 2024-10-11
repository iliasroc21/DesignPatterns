package creational.singleton;

public class Main  {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM users");

        Database bar = Database.getInstance();
        System.out.println(bar.equals(foo));
        bar.query("SELECT * FROM orders");
    }
}

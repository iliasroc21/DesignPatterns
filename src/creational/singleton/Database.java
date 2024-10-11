package creational.singleton;

public final class Database {
    private static Database instance;
    private Database(){

    }
    public static Database getInstance(){
        if(instance ==null){
            synchronized (Database.class){
                if(instance==null)instance = new Database();
            }

        }
        return instance;
    }
    public void query(String sql){
        System.out.println("Executing query : "+sql);
    }
}

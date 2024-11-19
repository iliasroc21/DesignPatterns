package behavioral.template.networks;

public abstract class Network {
    protected String username ;
    protected String password ;

    Network(String username ,  String password){
        this.password =password;
        this.username =username;
    }
    public boolean post(String message){
        if(logIn(username ,password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
    public abstract boolean logIn(String username , String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logOut();
}

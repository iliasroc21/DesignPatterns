package creational.prototype;

//Protoype
public abstract class Person implements Cloneable{
    private String name;
    protected Person(String name){
        this.name= name;
    }

    @Override
    protected Person clone(){
        try{
            return (Person)super.clone();
        }
        catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return null ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

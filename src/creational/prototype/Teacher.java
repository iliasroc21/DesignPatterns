package creational.prototype;

public class Teacher extends Person{
    private final String course;
    protected Teacher(String course , String name) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}

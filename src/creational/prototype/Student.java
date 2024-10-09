package creational.prototype;

public class Student extends Person{
    private Teacher teacher;
    protected Student(Teacher teacher , String name) {
        super(name);
        this.teacher  =teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    @Override
    public Student clone(){
        Student clonedStudent = (Student) super.clone();
        clonedStudent.teacher = (Teacher) teacher.clone(); // Clone the teacher as well
        return clonedStudent;
    }
}

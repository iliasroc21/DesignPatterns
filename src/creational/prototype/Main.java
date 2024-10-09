package creational.prototype;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Design Patterns", "Ilias");
        Teacher teacherClone = (Teacher) teacher.clone(); // Shallow copy of teacher
        System.out.println(MessageFormat.format(
                "Teacher was cloned: {0} who teaches {1}",
                teacherClone.getName(),
                teacherClone.getCourse()
        ));

        Student student = new Student(teacherClone, "James");
        Student studentClone = student.clone(); // Deep copy of student and teacher

        // Display original and cloned student
        System.out.println(MessageFormat.format(
                "Student was cloned: {0} that is enrolled in {1}''s course",
                studentClone.getName(),
                studentClone.getTeacher().getCourse()
        ));

        // Change the teacher's name in the cloned object
        teacherClone.setName("Mouad");

        // Display the teacher names for original and cloned student
        System.out.println("After changing teacherClone's name :");
        System.out.println(MessageFormat.format(
                "StudentClone: {0} is still enrolled in {1}''s course",
                studentClone.getName(),
                studentClone.getTeacher().getName()
        ));

        // The original student should reflect the change because it shares the teacher
        System.out.println(MessageFormat.format(
                "Original Student: {0} is now enrolled in {1}''s course",
                student.getName(),
                student.getTeacher().getName()
        ));

    }
}

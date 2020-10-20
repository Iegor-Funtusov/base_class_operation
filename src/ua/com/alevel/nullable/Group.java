package ua.com.alevel.nullable;

import java.util.Optional;

/**
 * @author Iehor Funtusov, created 20/10/2020 - 9:17 PM
 */
public class Group {

    private Student student;

    private Optional<Student> studentOptional;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Optional<Student> getStudentOptional() {
        return studentOptional;
    }
}

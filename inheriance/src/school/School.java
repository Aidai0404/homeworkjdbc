package school;

import people.Student;
import people.Teacher;

import java.util.Arrays;

public class School {
    private String name;
    private Student[]students;
    private Teacher[]teachers;

    public School(String name, Student[] students, Teacher[] teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}

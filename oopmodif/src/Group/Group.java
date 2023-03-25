package Group;

import Student.Student;

import java.util.Arrays;


public class Group {
   private Student [] students;
   private String subject;
   private int beginningofstudying;




    public Group(Student[] students, String subject, int beginningofstudying) {
        this.students = students;
        this.subject=subject;
        this.beginningofstudying=beginningofstudying;

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students =students;
        for(Student student: students){
            System.out.println(student);
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getBeginningofstudying() {
        return beginningofstudying;
    }

    public void setBeginningofstudying(int beginningofstudying) {
        this.beginningofstudying = beginningofstudying;
    }

    @Override
    public String toString() {
        return "Group: " +
                "\nstudents: " + Arrays.toString(students) +
                "\nsubject: " + subject +
                "\nbeginning of studying: " + beginningofstudying;
    }
}

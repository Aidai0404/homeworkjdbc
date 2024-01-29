public class School {
    private String name;
    private Student[]students;

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

    public int quantityOfStudents(){
        int count = 0;
        for(Student student : students){
            if(student.getAge()<10){
                count++;
                System.out.println("Name of student "+student.getName());
                System.out.println("Age of student "+student.getAge());
            }
        }
        return count;
    }
}

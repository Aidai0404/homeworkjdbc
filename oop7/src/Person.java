public class Person {
    String name;
    String lastname;
    int age;
    String schoolsname;
    String teacherOfsubjectOrwhatsubjectStudentlearns;

    public Person(String name,String lastname,int age, String schoolsname,String teacherOfsubjectOrwhatsubjectStudentlearns) {
        this.name = name;
        this.lastname=lastname;
        this.age=age;
        this.schoolsname=schoolsname;
        this.teacherOfsubjectOrwhatsubjectStudentlearns=teacherOfsubjectOrwhatsubjectStudentlearns;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolsname() {
        return schoolsname;
    }

    public void setSchoolsname(String schoolsname) {
        this.schoolsname = schoolsname;
    }

    public String getTeacherOfsubjectOrwhatsubjectStudentlearns() {
        return teacherOfsubjectOrwhatsubjectStudentlearns;
    }

    public void setTeacherOfsubjectOrwhatsubjectStudentlearns(String teacherOfsubjectOrwhatsubjectStudentlearns) {
        this.teacherOfsubjectOrwhatsubjectStudentlearns = teacherOfsubjectOrwhatsubjectStudentlearns;
    }
    public void doing(){
        System.out.println("Person's walking");

    }
}

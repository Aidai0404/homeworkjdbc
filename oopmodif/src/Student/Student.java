package Student;

public class Student {
   public int dateofB;
    private String name;
    private String surname;
    private String email;

    public Student(){

    }

    public Student(int dateofB,String name, String surname, String email) {
        this.dateofB = dateofB;
        this.name=name;
        this.surname=surname;
        this.email=email;

    }


    public int getDateofB() {
        return dateofB;
    }

    public void setDateofB(int dateofB) {
        this.dateofB = dateofB;
        int age=2022-dateofB;
        if(age>0){
            System.out.println("Okey-dokey");
        }else{
            System.out.println("Вам не может быть столько лет!");

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student: " +
                "\ndateofB:" + dateofB +
                "\nname: " + name  +
                "\nsurname: " + surname +
                "\nemail: " + email;
    }
}

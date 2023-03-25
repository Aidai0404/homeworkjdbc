public class Student {
    private int id;
    private String name;
    private String surname;
    private String otchestvo;
    private int marks;

    public Student(int id, String name, String surname, String otchestvo, int marks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class ITcourse extends Course{


    public ITcourse(String name, String namestu,int id,int idstu,int yearsofstuding, int quantityofstudents, String subject) {
        super(name, namestu,id,idstu,yearsofstuding, quantityofstudents, subject);
    }

    @Override
    public String toString() {
        return "ITcourse: " +
                "\nteacher's name: " + name +
                "\nID of teacher: "+ id+
                "\nstudent's name: "+namestu+
                "\nID of student: "+idstu+
                "\nyears of studying: "+yearsofstudying+
                "\nquantity of students: "+quantityofstudents+
                "\nsubject: "+subject;
    }
}

public class EnglishCourse extends Course{


    public EnglishCourse(String name,String namestu,int id,int idstu, int yearsofstudying, int quantityofstudents, String subject) {
        super(name,namestu,id,idstu, yearsofstudying, quantityofstudents, subject);
    }

    @Override
    public String toString() {
        return "\nEnglishCourse: " +
                "\nteacher's name: " + name +
                "\nID of teacher: "+ id+
                "\nstudent's name: "+namestu+
                "\nID of student: "+ idstu+
                "\nyears of studying: "+yearsofstudying+
                "\nquantity of students: "+quantityofstudents+
                "\nsubject: "+subject;
    }
}

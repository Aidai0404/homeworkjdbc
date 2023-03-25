public class Group {
    private String faculty;
    private int quantityofstudents;
    private String subjects;

    String getFaculty(){
        return faculty;
    }
    int getQuantityofstudents(){
        return quantityofstudents;
    }
    String getSubjects(){
        return subjects;
    }
    void setFaculty(String faculty){
        this.faculty=faculty;
    }
    void setQuantityofstudents(int quantityofstudents){
        this.quantityofstudents=quantityofstudents;
    }
    void setSubjects(String subjects){
        this.subjects=subjects;
    }
}

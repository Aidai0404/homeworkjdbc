public class Students {
    private String name;
    private int age;
    private String faculty;
    private String favouritesubjects;
    private String country;

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getFaculty(){
        return faculty;
    }
    String getFavouritesubjects(){
        return favouritesubjects;
    }
    String getCountry(){
        return country;
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    void setFaculty(String faculty){
        this.faculty=faculty;
    }
    void setFavouritesubjects(String favouritesubjects){
        this.favouritesubjects=favouritesubjects;
    }
    void setCountry(String country){
        this.country=country;
    }
}

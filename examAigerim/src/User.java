import java.util.Locale;

public class User {
    private String name;
    private int age;
    private String dateOfBirth;
    private String phoneNumber;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.length()>10){
            System.out.println("Мы не принимаем длинные номера");
        }
        this.phoneNumber = phoneNumber;
    }

}

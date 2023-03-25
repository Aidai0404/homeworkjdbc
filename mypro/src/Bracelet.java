public class Bracelet implements Haspatterns {
    private String ethnicity;
    private String[] color;
    private Patterns patternsmeaning;
    private String gender;
    private int length;


    public Bracelet(String ethnicity,String[] color,Patterns patternsmeaning,String gender,int length) {
        this.ethnicity = ethnicity;
        this.color=color;
        this.patternsmeaning=patternsmeaning;
        this.gender=gender;
        this.length=length;
    }

    public Bracelet() {


    }


    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String [] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public Patterns getPatternsmeaning() {
        return patternsmeaning;
    }

    public void setPatternsmeaning(Patterns patternsmeaning) {
        this.patternsmeaning = patternsmeaning;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void has() {
        System.out.println("Bracelet has patterns");
    }
}

package Course;

import java.util.Arrays;

public class Course {
    private String name;
    private long phonenumber;
    private String teachersname;
    private int[] array1;

    public Course(){

    }
    public Course(String name, long phonenumber,String teachersname,int[] array1){
        this.name=name;
        this.phonenumber=phonenumber;
        this.teachersname=teachersname;
        this.array1=array1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getTeachersname() {
        return teachersname;
    }

    public void setTeachersname(String teachersname) {
        this.teachersname = teachersname;

    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    @Override
    public String toString() {
        return "Course: " +
                "\n name: " + name  +
                "\n phonenumber: " + phonenumber +
                "\n teachersname: " + teachersname +
                "\n quantity of students: " + Arrays.toString(array1);
    }
}

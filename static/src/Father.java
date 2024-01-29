public class Father {
    static String name;
    final  String lastname = "Mamatbekova";

//    public Father(String lastname) {
//        this.lastname = lastname;
//    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Father.name = name;
    }
    public static  void myName(){
        System.out.println("My name is " + name);
    }

    public final void myName1(){
        System.out.println("My name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(); getInterface("Aida");
    }public static Walkable<String>getInterface(String name){
       Walkable<String>walkable1=(name2)-> {
           System.out.println(name+" is walking");
       };
        walkable1.walkable(name);
        return walkable1;
    }
}
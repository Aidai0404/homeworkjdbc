public class Main {
    public static void main(String[] args) {
       Bracelet bracelet =new Bracelet("Kyrgyz",new String[]{"Red","Blue","White"},new Patterns(new Friendsymbol("Dostuk","friendness","rings")),"female",18);
       bracelet.has();
       Friendsymbol fr=new Friendsymbol("Dostuk","friendness","rings");
       Bracelet br=fr;

}
}
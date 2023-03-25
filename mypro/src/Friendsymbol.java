public class Friendsymbol extends Patterns implements Getpattern {
     private String name;
     private String meaning;
     private String feature;
    public Friendsymbol(String name, String meaning, String feature) {
        super();
        this.name=name;
      this.meaning=meaning;
      this.feature=feature;

    }

    @Override
    public void getpattern() {
        System.out.println("");
    }
}

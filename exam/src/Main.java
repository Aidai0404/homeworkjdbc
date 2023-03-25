public class Main {
    public static void main(String[] args) {

        Parents[] family={new Father(),new Mother(),new Son()};
        for(Parents fam: family){
            if(fam.getClass().getName().equals("Father")){
                fam.live();
                ((Father) fam).work();
            }else if(fam instanceof Mother){
                fam.live();
                ((Mother) fam).cook();
            }else{
                fam.live();
                ((Son)fam).play();
            }
        }
    }
}
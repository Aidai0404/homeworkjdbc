package Generic;

import java.util.ArrayList;
import java.util.Collections;

public class Generic <I extends Number,D>{
    private ArrayList<I> san;
    private D name;

    public Generic(ArrayList<I> san, D name) {
        this.san = san;
        this.name=name;
    }

    public ArrayList<I> getSan() {
        return san;
    }

    public void setSan(ArrayList<I>san) {
        this.san = san;
    }

    public D getName() {
        return name;
    }

    public void setSan2(D name) {
        this.name= name;
    }

    public <I extends  Number & Comparable <I>> I method(ArrayList<I>max1) {
        int begin=0;
        I maxi=max1.get(begin);
        for (int i = begin+1; i < max1.size(); i++) {
           if(max1.get(i).compareTo(maxi)>0){
               maxi=max1.get(i);
           }
        }
return maxi;
    }
    @Override
    public String toString() {
        return "Generic{" +
                "san=" + san +
                ", san2=" + name +
                '}';
    }
}

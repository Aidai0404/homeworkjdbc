package linkedlistpractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList<User>list=new LinkedList<>();
        list.add(new User(321445,"Jordan",28));
        list.add(new  User(123422,"Leila",24));
        list.add(new User(132452,"Jack",21));
        list.add(new User(3241621,"Ann",30));

        sortById(list);
        sortByAge(list);
        sortByName(list);
    }
    public static void sortById (LinkedList<User>idsorts){
        Collections.sort(idsorts,User.idsorts);
        for(User id:idsorts){
            System.out.println(id);
        }
    }
    public static void sortByAge(LinkedList<User>sortage){
        Collections.sort(sortage,User.agesorts);
        for(User age:sortage){
            System.out.println(age);
        }
    }
    public static void sortByName(LinkedList<User>sortName){
        Collections.sort(sortName,User.namesorts);
        for(User name:sortName){
            System.out.println(name);
        }
    }
}


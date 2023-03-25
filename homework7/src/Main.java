import java.util.*;

public class Main {
    public static void main(String[] args) {
        City city = new City(2177, "Tokio");
        City city2 = new City(1222, "Moscow");
        City city3 = new City(2315, "Los-Angeles");
        City city4 = new City(1231, "Seoul");
        ArrayList<City>cities=new ArrayList<>();
        cities.add(city);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);

                TreeSet<City>citiy=new TreeSet<>(new Comparator<City>() {
                    @Override
                    public int compare(City o1, City o2) {
                        return o2.getYear()- o1.getYear();
                    }
                });

              for(City cityl:cities){
                  if(cityl.getYear()%2!=0){
                      citiy.add(cityl);
                  }

              }for(City cituk:citiy){
            System.out.println(cituk);
        }



            }

//        Map<Integer,String>cities=new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        cities.put(city.getYear(),city.getName());
//        cities.put(city2.getYear(),city.getName());
//        cities.put(city3.getYear(),city.getName());
//        cities.put(city4.getYear(), city4.getName());
//        for(Map.Entry<Integer,String> c:cities.entrySet()){
//            if(c.getKey()%2!=0){
//                System.out.println(c);
//            }
//        }

    }

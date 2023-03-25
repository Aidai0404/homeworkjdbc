import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static GsonBuilder gsonBuilder = new GsonBuilder();
    private static Gson gson = gsonBuilder.setPrettyPrinting().create();
    private static Path URL = Paths.get("MotorPro.json");

    private static Path URLDriver = Paths.get("MotorProDriver.json");
    public static void main(String[] args) throws Exception{
        /**
         * Welcome guis it is first project of second stage
         * good luck*/


        Truck[] truck = {
                Truck.truck(1, "Renault Magnum", new Driver(), State.BASE),
                Truck.truck(2, "Volvo", new Driver(), State.BASE),
                Truck.truck(3, "DAF XT", new Driver(), State.BASE)
        };
        String json = gson.toJson(truck);
        write(json);

        Truck [] trucks=gson.fromJson(read(),Truck[].class);
        System.out.println("       Info about trucks\n----------------------------------");
        System.out.println("#  | Bus  |  Driver |  State\n      —+———-+———+———");
        for(Truck trucks1: trucks){
            System.out.println(trucks1);
        }
        Driver [] drivers = {
                Driver.driver(1,"Petr",""),
                Driver.driver(2,"Fedor",""),
                Driver.driver(3,"Anton","")
        };
}

}
import company.*;
import products.*;
import shop.Manager;
import shop.Shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 22);
        LocalDate date1 = LocalDate.of(2022, 11, 26);
        LocalDate date2 = LocalDate.of(2022, 12, 24);
        LocalDate date3=LocalDate.of(2022,12,26);


        //
        ArrayList<Milk> milk = new ArrayList<>();
        milk.add(new Milk("Молоко-1", date1, Company.PROSTOKVASHINO));
        milk.add(new Milk("Молоко-2", date, Company.MILKA));
        milk.add(new Milk("Молоко-3", date2, Company.MILKA));


        ArrayList<Buttermilk> buttermilks = new ArrayList<>();
        buttermilks.add(new Buttermilk("Кефир-1", date2,Company.MILKA));
        buttermilks.add(new Buttermilk("Кефир-2", date3,  Company.MILKA));
        buttermilks.add(new Buttermilk("Кефир-3", date, Company.PROSTOKVASHINO));

        ArrayList<Yogurt> yogurts = new ArrayList<>();
        yogurts.add(new Yogurt("Йогурт-1", date3, Company.PROSTOKVASHINO));
        yogurts.add(new Yogurt("Йогурт-2", date2, Company.MILKA));
        yogurts.add(new Yogurt("Йогурт-3", date, Company.MILKA));

        ArrayList<MilkProducts> milkProducts = new ArrayList<>();
        milkProducts.addAll(milk);
        milkProducts.addAll(buttermilks);
        milkProducts.addAll(yogurts);




        ArrayList<Meat> meats = new ArrayList<>();
        meats.add(new Meat("Мясо-говядина-1", date2,Company.PAPAMOZHET));
        meats.add(new Meat("Мясо-свинина-2", date, Company.PAPAMOZHET));
        meats.add(new Meat("Курятина-3", date3, Company.TOIBOSS));

        ArrayList<Sausage> sausages = new ArrayList<>();
        sausages.add(new Sausage("Копченая колбаса-1", date3, Company.PAPAMOZHET));
        sausages.add(new Sausage("Докторская колбаса-2", date2, Company.TOIBOSS));
        sausages.add(new Sausage("Колбаса-полукопченная-3", date1, Company.TOIBOSS));

        ArrayList<Fish> fish = new ArrayList<>();
        fish.add(new Fish("Лосось", date, Company.PAPAMOZHET));
        fish.add(new Fish("Тунец", date2, Company.TOIBOSS));
        fish.add(new Fish("Кильки", date1, Company.PAPAMOZHET));

        ArrayList<MeatProducts> meatProducts = new ArrayList<>();
        meatProducts.addAll(meats);
        meatProducts.addAll(sausages);
        meatProducts.addAll(fish);

//

        ArrayList<Bread> breads = new ArrayList<>();
        breads.add(new Bread("Батон", date3, Company.NUR));
        breads.add(new Bread("Багет", date2, Company.BUUDAI));
        breads.add(new Bread("Черный хлеб", date, Company.NUR));

        ArrayList<Pasta> pastas = new ArrayList<>();
        pastas.add(new Pasta("Вермишель", date,Company.NUR));
        pastas.add(new Pasta("Спагетти", date3,Company.NUR));
        pastas.add(new Pasta("Лазанья", date1,Company.BUUDAI));

        ArrayList<Flour> flours = new ArrayList<>();
        flours.add(new Flour("Рисовая мука", date3, Company.BUUDAI));
        flours.add(new Flour("Пшеничная мука", date, Company.NUR));
        flours.add(new Flour("Кукурузная мука,", date2, Company.BUUDAI));


        ArrayList<WheatProducts> wheatProducts = new ArrayList<>();
        wheatProducts.addAll(flours);
        wheatProducts.addAll(pastas);
        wheatProducts.addAll(breads);

        //

        Shop shop = new Shop(milkProducts, meatProducts, wheatProducts);

        shop.deleteByDate(wheatProducts);
        shop.deleteByDate(meatProducts);
        shop.deleteByDate(milkProducts);
        shop.placeInTheDiscountShowcase(wheatProducts);
        shop.placeInTheDiscountShowcase(meatProducts);
        shop.placeInTheDiscountShowcase(milkProducts);
        manager(shop,milkProducts,meatProducts,wheatProducts);

    }

    public static  void manager(Shop shop,List<MilkProducts> products,
                                List<MeatProducts> meatProducts,ArrayList<WheatProducts>wheatProducts) {
        ArrayList<Products> products1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String password = sc.nextLine();
            if (login.equals(Manager.login) && password.equals(Manager.password)) {
                products1.addAll(products);
                products1.addAll(meatProducts);
                products1.addAll(wheatProducts);

            } else {
                System.out.println("Напишите правильно код");

        }
        System.out.println(products1);
    }
}

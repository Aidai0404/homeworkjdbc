package shop;

import company.Company;
import products.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop implements DeleteByDate,DiscountShowcase {
    private ArrayList<MilkProducts> milkProducts;
    private ArrayList<MeatProducts> meatProducts;
    private ArrayList< WheatProducts>wheatProducts;
    private  final LocalDate localDate=LocalDate.of(2022,12,30);


    public Shop(ArrayList<MilkProducts> milkProducts,ArrayList<MeatProducts> meatProducts, ArrayList<WheatProducts> wheatProducts) {
        this.milkProducts = milkProducts;
        this.meatProducts = meatProducts;
        this.wheatProducts = wheatProducts;

    }


    public ArrayList<MilkProducts> getMilkProducts() {
        return milkProducts;
    }

    public void setMilkProducts(ArrayList<MilkProducts> milkProducts) {
        this.milkProducts = milkProducts;
    }

    public ArrayList<MeatProducts> getMeatProducts() {
        return meatProducts;
    }

    public void setMeatProducts(ArrayList<MeatProducts> meatProducts) {
        this.meatProducts = meatProducts;
    }

    public ArrayList<WheatProducts> getWheatProducts() {
        return wheatProducts;
    }

    public void setWheatProducts(ArrayList<WheatProducts> wheatProducts) {
        this.wheatProducts = wheatProducts;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public void deleteByDate(List<? extends Products>products) {
        ArrayList<Products> vitrina =new ArrayList<>();
        for(Products products1:products) {
            if (products1.getDate().isBefore(localDate) && products1.getCompany().equals(Company.NUR)
                    || products1.getCompany().equals(Company.MILKA) || products1.getCompany().equals(Company.TOIBOSS)) {
                 vitrina.add(products1);
            } else if (products1.getDate().isAfter(localDate)) {
                System.out.println("Не допускаются: " + products1);
            }
        }
        System.out.println("Не просрочены: " + vitrina + "\n");

    }
    @Override
    public void placeInTheDiscountShowcase(List<? extends Products> products) {
        // витрина
        ArrayList<Products>products1sales=new ArrayList<>();
        System.out.println("\nНа витрину скидок");
        for(Products products2:products){
            if(products2.getDate().plusDays(7).isBefore(localDate)){
                products1sales.add(products2);
            }else if(products2.getDate().plusDays(7).isAfter(localDate)){
                products1sales.remove("Не допускаются: "+products2);
            }
        }
        System.out.println(products1sales);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "milkProducts=" + milkProducts +
                ", meatProducts=" + meatProducts +
                ", wheatProducts=" + wheatProducts +
                '}';
    }
}

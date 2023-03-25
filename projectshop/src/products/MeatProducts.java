package products;

import company.Company;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MeatProducts extends Products {


    public MeatProducts(String pro1, LocalDate date, Company company) {
        super(pro1, date, company);
    }
}

package products;

import company.Company;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MilkProducts extends Products {

    public MilkProducts(String pro1, LocalDate date, Company company) {
        super(pro1, date, company);
    }
}

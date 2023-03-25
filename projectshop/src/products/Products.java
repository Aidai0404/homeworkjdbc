package products;

import company.Company;

import java.time.LocalDate;
import java.util.List;

public abstract class Products {
    private String pro1;
    private LocalDate date;
    private Company company;


    public Products(String pro1,LocalDate date, Company company) {
        this.pro1 = pro1;
        this.date=date;
        this.company = company;

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPro1() {
        return pro1;
    }

    public void setPro1(String pro1) {
        this.pro1 = pro1;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Products{" +
                "pro1='" + pro1 + '\'' +
                ", date=" + date +
                '}';
    }
}

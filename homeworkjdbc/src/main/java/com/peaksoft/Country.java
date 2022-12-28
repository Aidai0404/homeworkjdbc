package com.peaksoft;

public class Country {
    private int city_id;
    private String name;

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "city_id=" + city_id +
                ", name='" + name + '\'' +
                '}';
    }
}

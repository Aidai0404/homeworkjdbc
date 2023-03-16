package com.peaksoft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
//        System.out.println(getCountCities());
//        System.out.println(getCountCountries());
//        System.out.println(getCountMayors());
//        createTable();
        System.out.println(cities());
        System.out.println(countries());
        System.out.println(getByID(2));
        createTable();


    }

    public static void createTable() {
        String SQL = "CREATE TABLE IF NOT EXISTS cities(" +
                "id SERIAL PRIMARY KEY," +
                        "name VARCHAR(50));";
        String SQL2 = "CREATE TABLE IF NOT EXISTS countries(" +
                "city_id  INT REFERENCES cities(id) NOT NULL," +
                        "name VARCHAR(50));";
        String SQL3 = "CREATE TABLE IF NOT EXISTS mayors(" +
                "city_id  INT REFERENCES cities(id) NOT NULL," +
                        "name VARCHAR(50));";

        try (Connection connection = DB.connection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQL);
            statement.executeUpdate(SQL2);
            statement.executeUpdate(SQL3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static int getCountCities() {
        String SQL = "SELECT COUNT(*) FROM cities;";
        int count = 0;
        try (Connection connection = DB.connection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                count = resultSet.getInt(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int getCountCountries() {
        String SQL = "SELECT COUNT(*) FROM countries;";
        int count = 0;
        try (Connection connection = DB.connection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                count = resultSet.getInt(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int getCountMayors() {
        String SQL = "SELECT COUNT(*) FROM mayors;";
        int count = 0;
        try (Connection connection = DB.connection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                count = resultSet.getInt(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void addCity(String name) {
        String SQL = "INSERT INTO cities(name) VALUES (?);";
        try (Connection connection = DB.connection();
             PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addCountry(int city_id, String name) {
        String SQL = "INSERT INTO countries(city_id,name) VALUES (?,?);";
        try (Connection connection = DB.connection();
             PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, city_id);
            statement.setString(2, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void addMayor(int city_id, String name) {
        String SQL = "INSERT INTO mayors(city_id,name) VALUES (?,?);";
        try (Connection connection = DB.connection(); PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, city_id);
            statement.setString(2, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<City> cities() {
        String SQL = "SELECT * FROM cities;";
        List<City> cities = new ArrayList<>();
        try (Connection conn = DB.connection(); Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }


        public static List<Country> countries () {
            String SQL = "SELECT * FROM countries;";
            List<Country> countries = new ArrayList<>();
            try (Connection connection = DB.connection(); Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(SQL);
                while (resultSet.next()) {
                    Country country = new Country();
                    country.setCity_id(resultSet.getInt("city_id"));
                    country.setName(resultSet.getString("name"));
                    countries.add(country);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return countries;
        }

        public static City getByID ( int id){
            String SQL = "SELECT * FROM cities WHERE id=?";
            City city = new City();
            try (Connection conn = DB.connection(); PreparedStatement statement = conn.prepareStatement(SQL)) {
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    city.setId(resultSet.getInt("id"));
                    city.setName(resultSet.getString("name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return city;
        }
    }





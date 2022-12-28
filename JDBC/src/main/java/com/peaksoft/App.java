package com.peaksoft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
//        addUser("Narbai",18);
//        addUser("Dilnaz",16);
//        addUser("Aidai",18);
//        addUser("Ablai",13);
//        createTable();
//        System.out.println(getCount());
//        System.out.println(getAllUsers());
        System.out.println(getByID(3));
    }
    public static void createTable(){
        String SQL = "CREATE TABLE IF NOT EXISTS users("+
                     "id SERIAL PRIMARY KEY,"+
                     "name VARCHAR(50),"+
                     "age INT );";
        try (Connection conn=DB.connection()){
            Statement statement= conn.createStatement();
            statement.executeUpdate(SQL);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static int getCount(){
        String SQL = "SELECT count(*) FROM users;";
        int count=0;
        try(Connection conn=DB.connection()){
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
           while(resultSet.next()){
               count=resultSet.getInt(1);
           }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    public static void addUser(String name, int age){
        String SQL = "INSERT INTO users(name,age) VALUES(?,?)";
        try(Connection conn=DB.connection();
            PreparedStatement statement = conn.prepareStatement(SQL)){
            statement.setString(1,name);
            statement.setInt(2,age);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static List<User>getAllUsers(){
        String SQL="SELECT * FROM users;";
    List<User> users= new ArrayList<>();
    try(Connection conn=DB.connection();Statement statement= conn.createStatement()){
        ResultSet resultSet= statement.executeQuery(SQL);
        while(resultSet.next()){
            User user=new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));
            users.add(user);
        }
    }catch (SQLException e){
        e.printStackTrace();
    }
    return users;
    }
    public static User getByID(int id){
        String SQL = "SELECT * FROM users WHERE id=?";
        User user=new User();
        try(Connection conn = DB.connection();  PreparedStatement statement = conn.prepareStatement(SQL)){
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}

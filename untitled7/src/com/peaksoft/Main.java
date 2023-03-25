package com.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    private static GsonBuilder GSONBUILDER=new GsonBuilder();
    private static Gson gson=GSONBUILDER.setPrettyPrinting().create();
    private static Path URL= Paths.get("./user.json");
    public static void main(String[] args){
        User [] users={
                User.createUser(1,"Aidai",Gender.FEMALE),
                User.createUser(2,"Dilnaz",Gender.FEMALE),
                User.createUser(3,"Bekbol",Gender.MALE),
                User.createUser(4,"Syimyk",Gender.MALE),

        };
        String json=gson.toJson(users);
//        write(json);
        System.out.println(read());
     User[]users1=gson.fromJson(read(),User[].class);
     for(User user: users1){
         System.out.println(user);
     }
    }
    public static void write(String json){
        try{
            Files.writeString(URL,json, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String read(){
        String json=" ";
        int a;
        try {
            FileReader reader=new FileReader(String.valueOf(URL));
            while ((a= reader.read())!=-1){
                json+=(char)a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }return json;
    }
}
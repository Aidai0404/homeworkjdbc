import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            create("Text.txt");
            write("Text.txt","Hello world");
            read("Text.txt");
            delete("Text.txt");
        }
        static void create(String file) {
            try {
                File file1=new File(file);
                file1.createNewFile();
            }catch(IOException e) {
                System.out.println("file is successfully created");

            }
        }
        static void write(String file,String text) {
            try {
                FileWriter writer=new FileWriter(file);
                writer.write(text);
                writer.close();
            } catch (IOException e) {
                System.out.println("it is not right");;
            }
        }
        static void read(String file){
            try {
                FileReader reader=new FileReader(file);
                Scanner sc=new Scanner(reader);
                while (sc.hasNextLine()){
                    System.out.println(sc.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("it's not right");;
            }

        }
        static void delete(String file){
            File file2=new File(file);
            System.out.println("the file is successfully deleted: "+file2.getName());
            file2.delete();


        }
    }

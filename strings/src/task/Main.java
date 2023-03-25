package task;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("song.txt");
        writer.write("Nothing else matters\n");
        writer.write("Metallica\n");
        writer.write("So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I do\n" +
                "n't just say\n" +
                "And nothing else matters");
        writer.close();

        FileReader reader=new FileReader("song.txt");
        Scanner sc=new Scanner(reader);
        Song song = new Song();
        song.setTitle(sc.nextLine());
        song.setAuthor(sc.nextLine());
        song.setText(sc.nextLine());
        System.out.println(song);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}

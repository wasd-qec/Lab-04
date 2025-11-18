import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class test3{
    public static void main (String[] args) throws IOException{

        File f = new File("D:\\School\\DPI JAVA\\lab4\\data4lab4ex1.csv");
        FileWriter fw = new FileWriter(f);
        Random r = new Random();
        int n;
        Scanner input = new Scanner(System.in);
        String name;

        for(int k=1; k<5; k++){
            System.out.println("Enter name "+ k + ": ");
            name = input.nextLine();

            n = r.nextInt(50,100);
            fw.write(k+","+name+",SE,"+n+"\n");
        }

        fw.close();
        input.close();
        System.out.println("Done");
        File myfile = new File("D:\\School\\DPI JAVA\\lab4\\data4lab4ex1.csv");
        Scanner read = new Scanner(myfile);
        String text;
        String array[];
         while (read.hasNext()){
            text = read.nextLine();
            array = text.split(",");
            System.out.printf("%-12s %-20s %-10s %-10s%n", array[0],array[1],array[2],array[3]);
        }
        read.close();
    }
}
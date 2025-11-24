
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test1{
    public static void main (String [] args) throws FileNotFoundException {
        File myfile = new File("D:\\School\\DPI JAVA\\lab4\\datatest.csv");
        Scanner sc = new Scanner(myfile);

        String text;
        String array[];

        sc.nextLine();
        System.out.printf("%-12s %-20s %-5s%n", "ID","Name","Gender" );
        while (sc.hasNext()){
            text = sc.nextLine();
            array = text.split(",");
            System.out.printf("%-12s %-20s %-5s%n", array[0],array[1],array[2] );
            
        }
    }
}
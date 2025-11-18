package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){

        try {
            Scanner sc = new Scanner(new File("D:\\School\\DPI JAVA\\lab4\\datatest.csv"));

            sc.useDelimiter(",");

            while(sc.hasNext()){
                System.out.print(sc.next()+" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

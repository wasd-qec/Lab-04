import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class lab4ex1 {
    public static void main(String [] args) throws IOException{
        File myfile = new File("LuckyNumber.csv");
        FileWriter fw = new FileWriter(myfile);
        Random r = new Random();
        int n=500;
        for(int i=0; i<n ; i++){
            int k = r.nextInt(1,1000);
            fw.write(k+"\n");
        }
        fw.close();
        Scanner read = new Scanner(myfile);
        while(read.hasNext()){
            String num = read.nextLine();
            System.out.println(num);
        }
    }
}

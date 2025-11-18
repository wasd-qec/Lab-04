import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class lab4ex2 {
    public static void main(String []args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of file: ");
        int n = sc.nextInt();
        Random r = new Random();
        for (int i=1; i<=n ; i++){
            File myfile = new File("D:\\School\\DPI JAVA\\lab4\\Ex2LuckyNumber\\file"+i+".csv");
            FileWriter fw = new FileWriter(myfile);
            int k = r.nextInt(1,100);
            String str = String.valueOf(k);
            System.out.println(k);
            fw.write(str);
            fw.close();
        }
        sc.close();
        System.out.println("Out of file: ");
        int[] num;
        num = new int[n];
        for (int i=0; i<n ; i++){
            File file = new File("D:\\School\\DPI JAVA\\lab4\\Ex2LuckyNumber\\file"+(i+1)+".csv");
            Scanner read = new Scanner(file);
            String toread ="";
            while (read.hasNext()){
            toread = read.nextLine();
            }
            num[i] = Integer.parseInt(toread);
            System.out.println(num[i]);
            read.close();
        }
        int min = 100;
        int max = 1;
        for (int i=0; i<n; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        for (int i =0; i<n ; i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("---------------");
        System.out.println(min);
        System.out.println(max);
    }
}

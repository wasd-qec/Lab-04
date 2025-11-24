import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab4ex3 {
    public static void main(String []args) throws IOException{
        Scanner sc = new Scanner(System.in);
        File myfile = new File("Ex3StudentData.csv");
        FileWriter fw = new FileWriter(myfile);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("This is student: "+ (i+1));
            System.out.print("Enter student name:");
            String name = sc.nextLine();
            System.out.print("Enter ID number:");
            String ID = sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine(); 
            fw.write(name+",");
            fw.write(ID+",");
            fw.write(gender+"\n");
        }
        fw.close();
    }

}

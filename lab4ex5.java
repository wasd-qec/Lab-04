import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab4ex5 {
   public static void main(String[] var0) throws IOException {
      File myfile = new File("Ex3StudentData.csv");
      Scanner sc = new Scanner(myfile);
      List<String> student = new ArrayList<>();
      
      while (sc.hasNextLine()) {
            student.add(sc.nextLine());
        }
      sc.close();  
      FileWriter fw = new FileWriter(myfile);
      System.out.print("Number of student you want to add:");
      Scanner sc2 = new Scanner(System.in);
      int n = sc2.nextInt();
      sc2.nextLine();
      for (int i=0; i<n; i++){
         System.out.println("This is student: "+ (i+1));
         System.out.print("Enter student name:");
         String name = sc2.nextLine();
         System.out.print("Enter ID number:");
         String ID = sc2.nextLine();
         System.out.print("Enter Gender: ");
         String gender = sc2.nextLine(); 
         fw.write(name+",");
         fw.write(ID+",");
         fw.write(gender+"\n");
      }
      for (String s : student){
         fw.write(s);
      }
      fw.close();
   }
}



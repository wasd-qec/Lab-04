import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab4ex4{
    public static void main(String []args) throws IOException{
        File myfile = new File("Ex3StudentData.csv");
        Scanner sc = new Scanner(myfile);
        List<labex41> student = new ArrayList<>();

        String text;
        String array[];
        String name="";
        String ID="";
        String gender="";

        while (sc.hasNext()){
            text = sc.nextLine();
            array = text.split(",");
            name = array[0];
            ID = array[1];
            gender = array[2];
            student.add(new labex41(name,ID,gender));
        }
        sc.close();
        for (labex41 s : student){
            s.showinfo();
            System.out.println();
    }
}
}

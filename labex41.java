public class labex41 {
    String name;
    String ID;
    String gender;
    labex41(String name, String ID, String gender){
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }
    void showinfo(){
         System.out.printf("%-20s %-20s %-10s%n", ID,name,gender);
    }
}

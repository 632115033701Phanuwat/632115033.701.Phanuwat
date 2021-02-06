package week9;
import java.util.Scanner;

public class Student {
    Scanner firstname1 = new Scanner(System.in);
    Scanner lastname1 = new Scanner(System.in);
    //overiding toString()
    public String toString(){
        String firstname = firstname1.nextLine();
        String lastname = lastname1.nextLine();
        return "My firstname "+firstname+" last name "+lastname;
    }
    public static void main(String[] args) {
        System.out.print("Input you firstname and lastname : ");
        Student p = new Student();
        System.out.println(p.toString());
    }
    
}

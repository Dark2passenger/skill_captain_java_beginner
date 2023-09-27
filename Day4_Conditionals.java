package skill_captain_java_beginner;
import java.util.Scanner;
public class Conditions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int userInput1 = scan.nextInt();
        System.out.println("Enter the Number 2: ");
        int userInput2 = scan.nextInt();
        System.out.println("The larger value is: " + (userInput1>userInput2?userInput1:userInput2));

    }
}

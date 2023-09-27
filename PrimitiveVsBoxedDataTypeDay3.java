package skill_captain_java_beginner;
import java.util.Scanner;
public class PrimitiveVsBoxedDateType {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int userAge = scan.nextInt();
        System.out.println("Enter Your Name");
        /*
        This is where the nextLine(),skips the user input for name because it reads the remaining space from
        the nextInt() as the input of nextLIne()
        To solve it we can use the nextLine() method to clear the input buffer
         */
        scan.nextLine();
        String userName= scan.nextLine();
        System.out.printf("Hello %s!, Your age is %d%n",userName,userAge);
    }
}

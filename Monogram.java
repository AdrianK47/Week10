import java.util.*;
public class Monogram{
    public static void main(String args[]){
        String first;
        String second;
        String third;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        first = input.next();
        System.out.print("Enter your middle initial: ");
        second = input.next();
        System.out.print("Enter your last name: ");
        third = input.next();

        first = first.substring(0,1);
        second = second.substring(0,1);
        third = third.substring(0,1);
        System.out.println(first.toLowerCase() + third.toUpperCase() + second.toLowerCase());
    }
}
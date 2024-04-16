import java.util.*;
public class RemoveString {
    public static void main(String args[]){
        String sentence;
        String string;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        System.out.print("Enter a string: ");
        string = input.next();

        sentence = sentence.replace(" " + string, "");

        System.out.println(sentence);

    }
}

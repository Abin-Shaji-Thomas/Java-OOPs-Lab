import java.util.*;

public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        char firstChar = str.charAt(0);
        String result = firstChar + str.substring(1).replace(firstChar, '$');

        System.out.println("Output:");
        System.out.println(result);

        sc.close();
    }
}

import java.util.*;

public class Question_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String str = sc.nextLine().trim();

        String[] arr = str.split(" ");

        System.out.println("Enter the word to search:");
        String sr = sc.next();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(sr)) {
                count++;
            }
        }

        System.out.println("The given word \"" + sr + "\" is found " + count + " times.");

        sc.close();
    }
}

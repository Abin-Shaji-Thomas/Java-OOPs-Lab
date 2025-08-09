import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine(); 
        String text = str.toLowerCase();
        boolean perfect = true;
        for(int i = 0; i < text.length(); i++) {
            for(int j = i + 1; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j)) {
                    perfect = false; 
                    break;
                }
            }
            if(!perfect)
                break;
        }

        if(perfect)
            System.out.println(" perfect");
        else
            System.out.println("Not perfect");
    }
}

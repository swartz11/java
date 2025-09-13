import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        String[] words = input.split("\\s+");
    
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            // Reverse characters in each word
            // StringBuilder word = new StringBuilder(words[i]);
            // reversed.append(word.reverse());

            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Reversed words: " + reversed.toString());
    }
}
 
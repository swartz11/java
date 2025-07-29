import java.util.Scanner;

public class LastCharOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char lastChar = word.charAt(word.length() - 1);
                if (Character.isLetter(lastChar)) {
                    result.append(lastChar);
                }
            }
        }

        System.out.println(result.toString());
    }
}

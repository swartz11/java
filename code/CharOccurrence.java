import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256];  // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        // Traverse string again to preserve order, but only first occurrence
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] > 0) {
                result.append(ch).append(freq[ch]);
                freq[ch] = 0;  
            }
        }

        System.out.println("Output: " + result.toString());

        sc.close();
    }
}

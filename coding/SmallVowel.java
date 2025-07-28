import java.util.Scanner;

public class SmallVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();  
        char smallest = 'z' + 1; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) { 
                if (ch < smallest) {
                    smallest = ch;
                }
            }
        }

        if (smallest == 'z' + 1) {
            System.out.println("No vowels found");
        } else {
            System.out.println(smallest);
        }

        sc.close();
    }
}
 
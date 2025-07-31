import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        System.out.println(words.length);
    }}
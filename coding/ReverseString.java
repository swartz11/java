import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = new StringBuilder(s).reverse().toString().toLowerCase();
        System.out.println(str);
    }
}

import java.util.Scanner;
public class RemoveChar{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // char c = sc.next().charAt(0);
        String re = sc.nextLine();
        String pattern = "[" + re +"]";
        String result = s.replaceAll(pattern,"");
        // String ss = s.replace(String.valueOf(c),"");
        // System.out.println(ss);
        System.out.println(result);
    }
} 
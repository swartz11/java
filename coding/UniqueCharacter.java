import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        List<Character> arr = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if (!arr.contains(ch)){
                arr.add(ch);
            }
        }
        for(char ch: arr){
            System.out.print(ch);
        }
    }
}

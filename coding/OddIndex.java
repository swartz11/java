import java.util.Scanner;

public class OddIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char f = s.charAt(i);
            if(i%2!=0){
                str.append(f);
            }
        }
        System.out.println(str.toString());
    }
}
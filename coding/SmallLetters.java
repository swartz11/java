import java.util.Scanner;

public class SmallLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lower =0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='a' && ch<='z'){
                lower++;
            }
        }
        if(lower>0){
            System.out.println(lower);
        }else{
            System.out.println("no lower case string found");
        }
    }
}
// import java.util.Scanner;

// public class SmallLetters {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int lower=0;
//         for (int i=0; i<s.length();i++){
//             if(Character.isLowerCase(s.charAt(i))){
//                 lower++;
//             }
//         }
//         if(lower>0){
//             System.out.println(lower);
//         }else{
//             System.out.println("no lower case found");
//         }
//     }
// }

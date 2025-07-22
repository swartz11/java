// import java.util.Scanner;

// public class StringVowel {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int count = 0;
//         String[] words = s.split("\\s+");
//         if (s.isEmpty()){
//             System.out.println("String not found");
//         }

//         for(String word:words){
//             if(word.matches("(?i)^[aeiou].*")){
//                 count++;
//             }
//         }
//         if(count>0){
//             System.out.println(count);
//         }else{
//             System.out.println("NO string found");
//         }
//     }
// }

import java.util.Scanner;

public class StringVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int count = 0;
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            char f = words[i].charAt(0);
            if (f == 'A' || f == 'E' || f == 'I' || f == 'O' || f == 'U' ||
            f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
            count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("NO string found");
        }
    }
}
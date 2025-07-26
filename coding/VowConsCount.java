import java.util.Scanner;

// public class VowConsCount {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s =sc.nextLine();
//         int vow =0;
//         int con =0;
//         String vowels="aeiouAEIOU";
//         for (int i=0; i<s.length();i++){
            
//             Character f = s.charAt(i);
//             if(Character.isLetter(f)){
//                 if(vowels.indexOf(f) != -1){ 
//                     vow++;
//             }else{
//                 con++;
//             }
//         }
        
//     }
//     System.out.println("Vowel count-" +vow);
//     System.out.println("Consonant count-" +con);
// }
// }


// ---- using simple helper method --- 

// public class VowConsCount {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         s =s.toLowerCase();
//         int vow =0;
//         int con =0;
//         for(int i=0;i<s.length();i++){
//             char f =s.charAt(i);
//             if(Character.isLetter(f)){
//                 if(isVowel(f)){
//                     vow++;
//                 }else{
//                     con++;
//                 }
//             }
//         }
//         System.out.println(vow);
//         System.out.println(con);
//     }

//     public static boolean isVowel(char ch){
//         return ch == 'a' || ch == 'e' || ch == 'i' ||
//                ch == 'o' || ch == 'u';
//     }
// }

//--------- using regex ---------

public class VowConsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vow =0;
        int con =0;
s = s.replaceAll("[^a-zA-Z]", ""); 
// s =s.toLowerCase();
for (int i = 0; i < s.length(); i++) {
    char ch = Character.toLowerCase(s.charAt(i));
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vow++;
    } else {
        con++;
    }
}
System.out.println(vow);
System.out.println(con);
    }}
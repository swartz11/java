import java.util.Scanner;

public class Space_Character_Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int spaceCount =0;
        int charCount =0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                continue; 
                } else if (Character.isWhitespace(ch)) {
                    spaceCount++;
                } else if (Character.isLetter(ch)) {
                    charCount++;
                }

            }
            System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);
            sc.close();
    }}

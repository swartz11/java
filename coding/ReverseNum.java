import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        StringBuffer str = new StringBuffer();
        str.append(num);
        System.out.println(str.reverse());
    }
}

// import java.util.Scanner;

// public class ReverseNum {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         while (num>0) {
//             System.out.print(num%10);       
//             num=num/10;
//     } }
// }
import java.util.Scanner;

// public class NumPat {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         for(int i =1;i<=size;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// 1 
// 1 2 
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// =========================================================================================

// public class NumPat {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         for(int i =size;i>=1;i--){
//             for(int j =1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// ======================================================================================================

// public class NumPat {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         for(int i =1;i<=size;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// ================================================================================================

// public class NumPat{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         for (int i =size; i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }System.out.println();
//         }

//     }
// }

// =============================================================================================

// public class NumPat{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         for (int i =1; i<=size;i++){
//             for (int s=1;s<=size-i;s++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }System.out.println();
//         }

//     }
// }

//     1 
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5

// ===================================================================================================

public class NumPat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i =1; i<=size;i++){
            for (int s=1;s<=size-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }

        for (int i =size-1; i>=1;i--){
            for (int s=1;s<=size-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }

    }
}

//     1 
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5
//  1 2 3 4
//   1 2 3
//    1 2 
//     1
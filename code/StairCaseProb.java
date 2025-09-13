import java.util.Scanner;

public class StairCaseProb {
    public static int count(int n){
        if (n<=2) return n;
        int[] ways = new int[n+1];
        ways[1] =1;
        ways[2] =2;
        for (int i=3;i<=n;i++){
            ways[i] =ways[i-1] + ways[i-2];

        }return ways[n];

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(count(num));
    }
}


// This is a classic dynamic programming / recursion with memoization problem, often called the "Climbing Stairs Problem".

// The idea is that:

// To reach step n, you could have come from step n-1 (taking 1 step) or from step n-2 (taking 2 steps).


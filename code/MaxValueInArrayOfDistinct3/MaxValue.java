package MaxValueInArrayOfDistinct3;
import java.util.Scanner;

public class MaxValue {
    

    public static int maxVal(int[] arr){
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num:arr){
            if (max<num){
                max = num;
            }
            if(min>num){
                min=num;
            }
        }return 2*(max-min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maxVal(a));
    }
}

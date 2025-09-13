import java.util.Scanner;

public class SingleNum{
    public static int uniqueNum(int[] nums){
        int result =0;
        for (int num:nums){
            result ^= num;
        }return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans = uniqueNum(nums);
        System.out.println(ans);
    }
}
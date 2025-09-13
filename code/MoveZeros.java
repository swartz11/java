import java.util.Scanner;

public class MoveZeros {
    public static void moveZeros(int[] nums){
        int insertPos =0;
        for(int num:nums){
            if (num!=0){
                nums[insertPos++] =num;
            }
        }
        while (insertPos<nums.length){
            nums[insertPos++] =0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeros(nums);
        System.out.print("Output: [");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

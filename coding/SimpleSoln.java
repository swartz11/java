import java.util.Scanner;

public class SimpleSoln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if (rem %2 !=0){
                count++;
            }
            num = num/10;
        }
        if(count>=3){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
    
}

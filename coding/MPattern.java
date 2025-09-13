import java.util.*;
public class MPattern {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        if (size%2==0 ||size <3){
            System.out.println("Pls enter number greater than 3 and it should be odd");
        }else{ 
        for (int i =0;i<size;i++){
            for (int j=0;j<size;j++){
                if (j==0 || j==size-1 ||(j==i && i<=size/2) ||(j==size-i-1 && i<=size/2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
}

    }
}
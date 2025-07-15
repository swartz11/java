import java.util.Scanner;
public class SimpleCalci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num1: ");
        double a = sc.nextDouble();

        System.out.println("Enter a num2: ");
        double b = sc.nextDouble();

        System.out.println("Enter a operation: ");
        char op = sc.next().charAt(0);

        double result = 0;

        // switch (op){
        //     case '+': result = a + b;
        //     break;
        //     case '-': result = a- b;
        //     break;
        //     case '*' : result = a*b;
        //     break;
        //     case '/': result = b!= 0 ? a/b:0;
        //     break;
        //     default : System.out.println("Enter valid operation");
        //     return;

        // }
        if (op == '+'){
            result = a +b;
            System.out.println(result);
        }else if (op == '-'){
            result = a-b;
            System.out.println(result);
        }else if (op == '*'){
            result = a*b;
            System.out.println(result);
        }else if (op == '/'){
            if(b!=0){
            result = a/b;}else{

            System.out.println("number cannot be divided by zero");
            }
            System.out.println(result);
        }

        System.out.println("Result:" +result);


    }

}
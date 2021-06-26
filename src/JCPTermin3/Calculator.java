package JCPTermin3;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.println("Enter operator +,-,/ ili * ");
        String operator = sc.next();
        switch(operator){
            case "+":
                System.out.println(x+y);
             break;
            case "-":
                System.out.println(x-y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            default:
                System.out.println("Error");
            
            
        }
    }
    
}

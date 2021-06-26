package JCPTermin2;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
// Racunamo povrsinu pravogaonika
public class RectangleArea {
    // Konstanta
    final static String measure = "cm^2";
    public static void main(String[] args) {
        int a,b,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a dimension: ");
        a = sc.nextInt();
        System.out.print("Enter b dimension: ");
        b = sc.nextInt();
        area = a*b;
        System.out.println("Area of rectangle is: " + area + " " +measure);
    }
    
    
}

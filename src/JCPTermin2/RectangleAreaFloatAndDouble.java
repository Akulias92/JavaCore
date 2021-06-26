package JCPTermin2;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class RectangleAreaFloatAndDouble {
    public static void main(String[] args) {
        //Primitive type are a,b,area
        float a,b,area;
        //new Scanner is constructor
        // Scanner is complex type, object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a dimension: ");
        a = sc.nextFloat();
        System.out.print("Enter b dimension: ");
        b = sc.nextFloat();
        area = a*b;
        //System.out.println("Rectangle area is: " + area + " cm^2");
        // Formatiranje decimalnog broja 
        System.out.format("Area is: %.2f cm^2\n", area);
    }
    
}

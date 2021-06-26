package JCPTermin3;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

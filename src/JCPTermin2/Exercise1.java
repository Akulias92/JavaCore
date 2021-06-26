package JCPTermin2;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Exercise1 {
    public static void main(String[] args) {
        int years;
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your years: ");
        years = sc.nextInt();
        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();
        System.out.println("You have " + years + " years" + " and your salary is " + salary);
        
    }
}

package JCPTermin2;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter level: ");
        int userLevel = sc.nextInt();
        System.out.println("User level is " + userLevel);
        System.out.println("Regular user level: " + (userLevel==1));
        System.out.println("Admin user level: " + (userLevel==2));
        System.out.println("Superadmin user level: " + (userLevel==4));
        
             
        }
        
        
    }                                       
    


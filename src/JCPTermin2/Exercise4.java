package JCPTermin2;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        //number%2 poredimo sa nulom. Ako je ostatak nula onda je paran broj true,
        //a ako broj ima ostatak pri poredjenju sa nulom onda je paran broj false
        System.out.println("Number is even:" + ((number%2)==0));        
    }
    
}

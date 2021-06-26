package JCPTermin3;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite redni broj: ");
        int dan = sc.nextInt();
        //Switch ne moze da se koristi za manje ili vece vec samo za poredjenje, na jednakost
        // If else moze da se koristi za manje vece i jednakost
        switch (dan) {
            case 1:
                System.out.println("Danas je ponedeljak");
                break;
            case 2:
                System.out.println("Danas je utorak");
                break;
            case 3:
                System.out.println("Danas je sreda");
                break;
            case 4:
                System.out.println("Danas je cetvrtak");
                break;
            case 5:
                System.out.println("Danas je petak");
                break;
            case 6:
                System.out.println("Danas je subota");
                break;
            case 7:
                System.out.println("Danas je nedelja");
                break;
            default:
                System.out.println("Greska");
                break;
        }
    
}
    }
    

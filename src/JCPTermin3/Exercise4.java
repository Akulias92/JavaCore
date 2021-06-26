package JCPTermin3;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite redni broj: ");
        int dan = sc.nextInt();
        if(dan==1)
            System.out.println("Danas je ponedeljak");
        else if(dan==2)
            System.out.println("Danas je utorak");
        else if(dan ==3)
            System.out.println("Danas je sreda");
        else if(dan == 4)
            System.out.println("Danas je cetvrtak");
        else if(dan == 5)
            System.out.println("Danas je petak");
        else if(dan == 6)
            System.out.println("Danas je subota");
        else if(dan == 7)
            System.out.println("Danas je nedelja");
        else
            System.out.println("Greska");
        }
        
    }
    


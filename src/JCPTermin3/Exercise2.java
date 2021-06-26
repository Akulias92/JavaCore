/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCPTermin3;

import java.util.Scanner;

/**
 *
 * @author lukak
 */
public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       // if (x % 2 == 0)
         //   System.out.println("Number is even");
         //else 
           // System.out.println("Number is odd");
           // Drugi nacin ispisivanja if elsa
           System.out.println((x%2==0) ? "x je paran" : "x je neparan");
        }
    }


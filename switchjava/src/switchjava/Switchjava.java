/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchjava;
import java.util.Scanner;
/**
 *
 * @author 36302
 */
public class Switchjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner bemenet = new Scanner(System.in);
    int valasz;

        System.out.print("\nAdj meg egy 1 és 7 közötti számot: ");
    valasz = bemenet.nextInt();
    
    while(valasz >= 8 && valasz <= 0){
        System.out.println("\nNem jó számot adtál meg.");
        valasz = bemenet.nextInt();
    }
    switch(valasz){
        case 1:
            System.out.println("\nHétfő van.");
            break;
        case 2:
            System.out.println("\nKedd van.");
            break;
        case 3:
            System.out.println("\nSzerda van.");
            break;
        case 4:
            System.out.println("\nCsütörtök van.");
            break;
        case 5:
            System.out.println("\nPéntek van.");
            break;
        case 6:
            System.out.println("\nSzombat van.");
            break;
        case 7:
            System.out.println("\nVasárnap van.");
            break;
    
    }
    }
    
}

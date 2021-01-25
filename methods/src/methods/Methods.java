/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

/**
 *
 * @author 36302
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
        static void tagolas(){
        System.out.println("\n--------------------------------------------------------------------------------\n");
    }
    
    public static void korMinosites(int eletKor){
        
        if(eletKor < 18)
            System.out.println("Kiskorú");
        
        else if(eletKor < 65)
            System.out.println("Felnőtt korú");
        
        else
            System.out.println("Nyugdijas korú");
           
    
    }

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int valasz;
        tagolas();
        System.out.println("Metódusok");
        tagolas();
        do {            
        System.out.print("\n\nAdd meg az életkorod, vagy más életkorát: ");
        korMinosites(bemenet.nextInt());
        System.out.print("\n\nSzeretnél új adatot megadni?(0-nem 1-igen) ");
        valasz = bemenet.nextInt();
        } while (valasz == 1);
        
    }
    }
    

    


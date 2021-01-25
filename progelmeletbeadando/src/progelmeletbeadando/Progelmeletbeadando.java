/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progelmeletbeadando;

/**
 *
 * @author 36302
 */
public class Progelmeletbeadando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
   /*1. Válassz ki 2 tiszta kód-alapelvet, és mutasd be egy Java-kódon keresztül!*/
   
   
   int randomSzam = 4;  /*Ezzel a példával szeretném bemutatni az egyik tiszta kód alapelvet,
   ami az értelmes név, melynek a lényege, hogy bárki megértse mi a célunk szimplán a név alapján.*/
   
   String nev = "Horváth János";
   
        System.out.println("Sziasztok az én nevem " + nev);
        
   int szuletesiEv = 2003;
   
        System.out.println("Én " + szuletesiEv + "-ben születtem");  /*Ezzel a példával is egy tiszta kód alapelvet szeretnék bemutatni, amely a formázás.
        Ennek a tiszta kód alapelvnek a lényege, hogy úgy formázzuk a programunkat, hogy mindenki számára átlátható legyen pl. sor kihagyások, szóközök,
        vagy akár a CamelCase*/
        
        
   //2. Mutasd be a relációs operátorok használatát!
   
   /*relációs operátorok : <, >, ==, =!, <=, >=
    < kisebb (pl. x>y)
   
    > nagyobb (pl. x<)
   
    <= kisebb vagy egyenlő(pl x<=3)
   
    >= nagyobb vagy egyenlő (pl. x>=3)
   
    == egyenlő (akkor használjuk, ha valamit egyenlővé akarunk tenni valamivel pl. x==3)
   
    =! nem egyenlő (akkor használjuk, ha azt akarjuk, hogy valami ne legyen egyenlő valamivel pl x=!3)*/
    
   
   //3. Milyen operátor fejezi ki a "logikai vagy"-ot? Mutasd be egy példán keresztül!

   if(12>3 || 13<3){  
            System.out.println("Ez helyes");}
   else {
       System.out.println("ez helytelen");}
   //A logiokiai vagy használatával a programunkban elég, ha egy feltétel teljesül, és akkor is lefut a program.

   
   
   
    }
    
}


package kerület;
import java.util.Scanner;
/**
 *
 * @author 36302
 */
public class Kerület {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
 int valasz;
    do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik alakzat kerületére vagy kivánics?\nAz opciók a következők:\n1-Téglalap\n2-kör\n3-Háromszög\n4-Szabályos ötszög\n5-Szabályos hatszög");
    int valasztas = scanner.nextInt();
    
    switch(valasztas){
        case 1:
            System.out.println("A téglalap kerülete: 2 * ( a + b)");
            break;
        case 2:
            System.out.println("A kör kerülete: 2 * r * π");
            break;
        case 3:
            System.out.println("A háromszög kerülete: a + b + c");
            break;
        case 4:
            System.out.println("A szabályos ötszök kerülete: 5 * a");
            break;
        case 5:
            System.out.println("A szabályos hatszög kerülete: 6 * a");
            break;   }
    System.out.print("\nSzeretne még egyet választani? Ha igen, akkor irj egy egyest, ha nem akkor irj bármi más számot!");    
    valasz = scanner.nextInt();
    
    }while (valasz == 1);
    }
    
}

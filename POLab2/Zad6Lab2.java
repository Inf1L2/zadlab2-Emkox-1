package zadanka3;
import java.util.Scanner;

/**
 *
 * @author Emek
 */
public class Zad6Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int zmienna;
        Scanner wczytaj =new Scanner(System.in);
          while(true){
            System.out.print("Wprowadz zmienną : ");
            zmienna= wczytaj.nextInt();
            if(zmienna<0){
            break;
            }
          }
            
    }      
}

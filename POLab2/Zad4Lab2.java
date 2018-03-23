import java.util.Scanner;

/**
 *
 * @author Emek
 */
public class Zad4Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[]= new int[10];
        int opcja=-1;
        int obl=0;
        Scanner wczytaj =new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print("Podaj "+(i+1)+" liczbe:");
            tab[i]=wczytaj.nextInt();
        }
        

        do{
        if (opcja==-1){
            System.out.println("[1] - suma");
            System.out.println("[2] - iloczyn");
            System.out.println("[3] - max");        
            System.out.println("[4] - srednia");
            System.out.println("[5] - min");
            System.out.println("[0] - wyjscie");
            System.out.print("Co chcesz zrobić? ");
            opcja=wczytaj.nextInt();
        }
        else if(opcja==1){
            for(int i=0;i<10;i++){
                obl+=tab[i];
            } 
            System.out.println("Suma elementow w tablicy:"+obl);
            obl=0;        
            opcja=-1;
        }else if(opcja==2){
            obl=tab[0];
            for(int i=1;i<10;i++){
                obl=obl*tab[i];
            } 
            System.out.println("Iloczyn elementow w tablicy:"+obl);
            obl=0; 
            opcja=-1;
        }else if(opcja==3){
           obl=tab[0];
            for(int i=1;i<10;i++){
                if(tab[i]>obl){
                    obl=tab[i];
                }
            }
            System.out.println("Maxymalny element"+obl);
            obl=0;
            opcja=-1;
        }else if(opcja==4){
            for(int i=0;i<10;i++){
                obl+=tab[i];
            } 
            System.out.println("Srednia:"+(obl/10));
            obl=0;        
            opcja=-1;           
        }else if(opcja==5){
           obl=tab[0];
            for(int i=1;i<10;i++){
                if(tab[i]<obl){
                    obl=tab[i];
                }
            }
            System.out.println("Maxymalny element"+obl);
            obl=0;
            opcja=-1;           
        }else if(opcja==0){
            opcja=0;
        }else{System.out.println("Nie ma takiej opcji.");}
        }while(opcja!=0);
        System.out.println("Dzięki za współprację :).");
    }
    
}

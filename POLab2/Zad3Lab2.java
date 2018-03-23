import java.util.Scanner;

/**
 *
 * @author Emek
 */
public class Zad3Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[]= new int[10];
        int opcja=-1;
        Scanner wczytaj =new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print("Podaj "+(i+1)+" liczbe:");
            tab[i]=wczytaj.nextInt();
        }
        

        do{
        if (opcja==-1){
            System.out.println("[1] - wyswietl tablice od poczatku");
            System.out.println("[2] - wyswietl tablice od konca");
            System.out.println("[3] - elementy o indeksach parzystych");        
            System.out.println("[4] - elementy o indeksach nieparzystych");
            System.out.println("[0] - wyjscie");
            System.out.print("Co chcesz zrobić? ");
            opcja=wczytaj.nextInt();
        }
        else if(opcja==1){
            for(int i=0;i<10;i++){
                System.out.println("Tablica["+i+"]="+tab[i]);
            } 
            opcja=-1;
        }else if(opcja==2){
            for(int i=9;i>=0;i--){
                System.out.println("Tablica["+i+"]="+tab[i]);
            }
            opcja=-1;
        }else if(opcja==3){
            for(int i=0;i<10;i++){
                if(((i%2)==0))
                    System.out.println("Tablica["+i+"]="+tab[i]);
                }
            opcja=-1;
        }else if(opcja==4){
            for(int i=0;i<10;i++){
                if(((i%2)!=0)){
                    System.out.println("Tablica["+i+"]="+tab[i]);
                }
            }
            opcja=-1;            
        }else if(opcja==0){
            opcja=0;
        }else{System.out.println("Nie ma takiej opcji.");}
        }while(opcja!=0);
        System.out.println("Dzięki za współprację :).");
    }
    
}

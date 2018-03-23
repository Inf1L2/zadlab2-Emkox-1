import java.util.Scanner;

/**
 *
 * @author Emek
 */
public class Zad7Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner wczytaj =new Scanner(System.in);
       int ileliczb,klucz,j,tymczasowa,opcja;
       int zmiana = 1;
       System.out.print("Ile liczb chcesz wprowadzic?");
       ileliczb=wczytaj.nextInt();
       int tab[]= new int[ileliczb];
       for(int i=0;i<ileliczb;i++){
            System.out.print("Podaj "+(i+1)+" liczbe:");
            tab[i]=wczytaj.nextInt();
       }
       System.out.print("[1] - Babelkowe");
       System.out.print("[2] - Wstawiania");
       System.out.print("[0] - Wyjscie");
       opcja=wczytaj.nextInt(); 
if (opcja==1){
    while(zmiana > 0){
        zmiana = 0;
        for(int i=0; i<tab.length-1; i++){
            if(tab[i]>tab[i+1]){
                tymczasowa = tab[i+1];
                tab[i+1] = tab[i];
                tab[i] = tymczasowa;
                zmiana++;
            }
        }
    }
    for(int i=0; i<tab.length; i++){
        System.out.print(tab[i]+" ");
    }
}else if (opcja==2){    
    for (int i=1;i<tab.length;i++){
        j=i;
        klucz=tab[i];
        while (j>0 && tab[j-1]>klucz){
            tab[j]=tab[j-1];
            j--;
        }
        tab[j]=klucz;
    }

    for(int i = 0 ; i<tab.length; i++){
        System.out.print(tab[i]+" ");
    }   
}  

}
    
}

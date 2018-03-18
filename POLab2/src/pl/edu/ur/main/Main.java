package pl.edu.ur.main;

/**
 *
 * @author Emek
 */
public class Main {
    public static void main(String args[]){
    int x;
    x=24;
    System.out.println("x = "+x);
    System.out.print("00000000 00000000 00000000 00011000");
    System.out.println("<-- liczbę x = 24 przesuwamy w prawo o 3");
    System.out.print("00000000 00000000 00000000 00000011");
    System.out.println("<-- w wyniku otrzymujemy liczbę 3");
    System.out.println("x = "+(x>>3));
    
    x=24;
    System.out.println("x = "+x);
    System.out.print("00000000 00000000 00000000 00011000");
    System.out.println("<-- liczbę x = 24 przesuwamy w prawo o 3");
    System.out.print("00000000 00000000 00000011 00000000");
    System.out.println("<-- w wyniku otrzymujemy liczbę 129");
    System.out.println("x = "+(x<<3));
    }
}

package horner;
import java.util.Scanner;

public class Horner {
    
    public static void main(String[] args) {
        
        // wielomian A(x) = ax^3 + bx^2 + cx + d
        System.out.println("Podaj wartosc x: ");
        double x2 = skan.nextDouble();
        double wsp[] = {1, 4.5, 2.1, 1.5}; // wspolczynniki wielomianu
        double wynikW1 = wsp[0];
        
        for(int i = 1; i <= 3; i++){
            wynikW1 = wynikW1 * x2 + wsp[1];
        }
        System.out.println(wynikW1);
        
    }
}

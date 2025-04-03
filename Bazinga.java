// define by Bazinga
import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Bazinga { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button =sc.nextInt();

        if (Button == 1){
            System.out.print("Hello");
        } else if (Button == 2){
                System.out.println(" Namaste");
        } else if (Button == 3) {
                System.out.println("Bonjour");
            } else {
                System.out.println("Invalid Button");
        }
    }
}
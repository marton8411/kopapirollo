package kopapirollo;

import java.util.Scanner;
import java.util.Random;

public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
//        System.out.println("egész: ");
//        int egesz = sc.nextInt();
//        System.out.println("A bekért szám duplája: " + egesz*2);
//        
//        sc.nextLine();
//        
//        System.out.println("szöveg: ");
//        String szoveg = sc.nextLine();
//        System.out.println("A bekért szöveg: " + szoveg);
        
        System.out.println("Döntésed: ");
        String userChoice = sc.nextLine();
        System.out.println("A döntésed: " + userChoice);
        
        String[] randomChoices = {"kő", "papír", "olló"};
        int compIndex = random.nextInt(3);
        String computerChoice = randomChoices[compIndex];
        System.out.println("A gép választása: " + computerChoice);
       
    }
    
}

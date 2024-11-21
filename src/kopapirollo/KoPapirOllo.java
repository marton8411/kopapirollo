package kopapirollo;

import java.util.Scanner;
import java.util.Random;

public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        /* Eleje tanári változat + megoldás enyém*/
        String[] valaszthatok = {"kő", "papír", "olló"};
        System.out.println("Mit választasz?");
        System.out.println("1. Kő");
        System.out.println("2. Papír");
        System.out.println("3. Olló");
        System.out.println("Választásod (1, 2, 3): ");
        
        int felhasznSzam = sc.nextInt();
        String felhasznValasztas = valaszthatok[felhasznSzam - 1];
        int gepSzam = random.nextInt(3) + 1;
        String gepValasztas = valaszthatok[gepSzam - 1];
        
        System.out.println("Választásod: " + felhasznValasztas);
        System.out.println("Gép választása: " + gepValasztas);
        
        if (felhasznSzam == gepSzam) {
            System.out.println("Döntetlen!");
        } else if (felhasznSzam == 1 && gepSzam == 3 || 
                   felhasznSzam == 2 && gepSzam == 1 ||
                   felhasznSzam == 3 && gepSzam == 2) {
            System.out.println("Nyertél!");
        } else if (felhasznSzam == 1 && gepSzam == 2 ||
                   felhasznSzam == 2 && gepSzam == 3 ||
                   felhasznSzam == 3 && gepSzam == 1) {
            System.out.println("Vesztettél!");
        }
        
        
        
        /* Saját változat */
        
//        System.out.println("Döntésed: ");
//        String userChoice = sc.nextLine();
//       
//        while (!userChoice.equals("kő") && !userChoice.equals("papír") && !userChoice.equals("olló")) {
//               System.out.println("Nem megfelelő! Döntésed: ");
//               userChoice = sc.nextLine();
//        }
//        System.out.println("A döntésed: " + userChoice);
//        
//        String[] randomChoices = {"kő", "papír", "olló"};
//        int compIndex = random.nextInt(3);
//        String computerChoice = randomChoices[compIndex];
//        System.out.println("A gép választása: " + computerChoice);
//        
//        if (userChoice.equals(computerChoice)) {
//            System.out.println("Döntetlen!");
//        } else if (userChoice.equals("kő") && computerChoice.equals("olló") ||
//                   userChoice.equals("papír") && computerChoice.equals("kő") ||
//                   userChoice.equals("olló") && computerChoice.equals("papír"))  {
//            System.out.println("Nyertél");
//        } else if (userChoice.equals("kő") && computerChoice.equals("papír") ||
//                userChoice.equals("papír") && computerChoice.equals("olló") ||
//                userChoice.equals("olló") && computerChoice.equals("kő")) {
//            System.out.println("Vesztettél!");
//        }
    }
    
}

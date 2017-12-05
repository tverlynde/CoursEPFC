package thomasverlynderepository;
import java.util.Scanner;
public class ThomasVerlyndeRepository {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] tableau = new char[80];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = '.';
        }
        String Choix;
        do {
            System.out.println("Tapez A pour ajouter un segment");
            System.out.println("Tapez I pour montrer le tableau");
            System.out.println("Tapez Q quitter le programme");
            Choix = input.next();
            switch (Choix) {
                case "A":
                    ajoutSegment(input, tableau);
                    break;
                case "I":
                    System.out.println(tableau);
                    break;
                case "Q":
                    System.out.println("A bientôt");
                    break;
                default:
                    System.out.println("Commande non exécutable");
            }
        } while (!Choix.equals("M") && !Choix.equals("Q"));
    }

    public static void ajoutSegment(Scanner input, char[] tableau) {
        System.out.println("Tapez caractère, puis position, puis longueur");
        char caractere = input.next().charAt(0);
        int positionInit = input.nextInt();
        int longueurInit = input.nextInt();
        for (int i = positionInit; i < positionInit + longueurInit; i++) {
            tableau[i] = caractere;
        }
    }
}

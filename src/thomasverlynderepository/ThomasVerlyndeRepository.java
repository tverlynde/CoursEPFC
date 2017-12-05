package thomasverlynderepository;
import java.util.Scanner;
public class ThomasVerlyndeRepository {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] tableau = initTableau();
        String Choix;
        do {
            Choix = affichageMenu(input);
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
        } while (!Choix.equals("Q"));
        input.close();
    }

    public static char[] initTableau() {
        char[] tableau = new char[80];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = '.';
        }
        return tableau;
    }

    public static String affichageMenu(Scanner input) {
        String Choix;
        System.out.println("Tapez A pour ajouter un segment");
        System.out.println("Tapez I pour montrer le tableau");
        System.out.println("Tapez Q quitter le programme");
        Choix = input.next();
        return Choix;
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

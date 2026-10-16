

import java.util.Scanner;

public class Conjugaison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un verbe (parler, finir, vendre) : ");
        String verbe = scanner.nextLine().toLowerCase().trim();

        String[] pronoms = {
            "Je", "Tu", "Il/Elle", "Nous", "Vous", "Ils/Elles"
        };

        String[] terminaisons;
        String radical;

        if (verbe.endsWith("er") && verbe.length() > 2) {
            radical = verbe.substring(0, verbe.length() - 2);
            terminaisons = new String[]{
                "e", "es", "e", "ons", "ez", "ent"
            };

        } else if (verbe.endsWith("ir") && verbe.length() > 2) {
            radical = verbe.substring(0, verbe.length() - 2);
            terminaisons = new String[]{
                "is", "is", "it", "issons", "issez", "issent"
            };

        } else if (verbe.endsWith("re") && verbe.length() > 2) {
            radical = verbe.substring(0, verbe.length() - 2);
            terminaisons = new String[]{
                "s", "s", "", "ons", "ez", "ent"
            };

        } else {
            System.out.println("Verbe non reconnu.");
            scanner.close();
            return;
        }

        System.out.println("\nConjugaison du verbe : " + verbe);

        for (int i = 0; i < pronoms.length; i++) {
            System.out.println(
                pronoms[i] + " " + radical + terminaisons[i]
            );
        }

        scanner.close();
    }
}

/**
 * a) Classe représentant une montre (heures et minutes).
 */
public class Montre {

    private int heures;
    private int minutes;
    private Personne porteur; // c) permet de savoir qui porte cette montre (null = personne)

    /** Constructeur à partir d'un couple heure/minute. */
    public Montre(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        this.porteur = null;
    }

    /** Constructeur "clone" : crée une montre à partir d'une autre montre existante. */
    public Montre(Montre autre) {
        this.heures = autre.heures;
        this.minutes = autre.minutes;
        this.porteur = null; // le clone n'est porté par personne au départ
    }

    /** Avance la montre d'une minute (minutes limitées à 60, heures à 24). */
    public void avancerUneMinute() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            heures++;
            if (heures == 24) {
                heures = 0;
            }
        }
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    // ---- c) Gestion du porteur (utilisée par Personne) ----

    public boolean estPortee() {
        return porteur != null;
    }

    public Personne getPorteur() {
        return porteur;
    }

    void setPorteur(Personne p) {
        this.porteur = p;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", heures, minutes);
    }

    /** Méthode principale demandée en a). */
    public static void main(String[] args) {
        Montre m1 = new Montre(13, 45);        // montre affichant 13h45
        Montre m2 = new Montre(m1);            // clone de la première

        System.out.println("Montre 1        : " + m1);
        System.out.println("Montre 2 (clone): " + m2);

        m1.avancerUneMinute();
        System.out.println("Après avancée d'une minute sur m1 : " + m1);
        System.out.println("m2 reste inchangée                : " + m2);
    }
}
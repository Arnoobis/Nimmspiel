/**
 * Spieler eines Spieles, nicht mutierbar, hält den Spielernamen und kann ihn herausgeben.
 */
public class Spieler {

    private String name;

    /**
     * Konstruktor
     * @param name Spielername
     */
    public Spieler(String name) {
        this.name = name;
    }

    /**
     * Getter für Spielernamen
     * @return Spielername
     */
    public String getName() {
        return name;
    }

}
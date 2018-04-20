public class Steinhaufen {

    private int anzahlSteine;

    /**
     * Konstruktor Steinhaufen
     */
    public Steinhaufen() {
        // Anfangsanzahl der Steine zufällig festgelegt
        anzahlSteine = Double.valueOf(Math.floor(Math.random() * 10 + 20)).intValue();
    }

    /**
     * Getter für Anzahl der Steine3
     *
     * @return Anzahl der Steine
     */
    public int getAnzahlSteine() {
        return anzahlSteine;
    }

    /**
     * Nimm!
     * @param n Anzahl der genommenen Steine
     * @return true, falls noch Steine vorhanden; false, wenn nicht
     */
    public boolean reduziereAnzahlSteine(int n) {
        anzahlSteine -= n;
        return anzahlSteine > 0;
    }

}
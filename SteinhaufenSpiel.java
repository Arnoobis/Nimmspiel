import java.io.IOException;
import java.util.Scanner;

/**
 * Klasse SteinhaufenSpiel, implementiert die Spiellogik sowie I/O-Funktionalität
 */
public class SteinhaufenSpiel {

    //---------- statischer Part ------------

    /**
     * Die Eintrittsmethode für das Programm
     * @param args CLI Argumente, in unserem Fall nicht von Bedeutung
     */
    public static void main(String[] args){
        SteinhaufenSpiel spiel = new SteinhaufenSpiel();
        spiel.spielen();
    }


    //---------- Nicht-statische Felder  ------------


    private Steinhaufen steinhaufen;

    private Spieler[] spieler = new Spieler[2];
    private int dran = 0;
    private int anzahlSpielrunden = 0;
    private Scanner scanner = new Scanner(System.in);
    private int[] anzahlGewinne = new int[2];


    //---------- Oeffentliche Methoden ------------

    /**
     * Konstruktor, fragt Spielernamen ab.
     */
    public SteinhaufenSpiel() {
        spieler[0] = new Spieler(eingabe(1));
        spieler[1] = new Spieler(eingabe(2));
        anzahlGewinne[0] = anzahlGewinne[1] = 0;
    }

    /**
     * Hauptmethode, in der das Spiel in Schleife abläuft bis es abgebrochen wird
     */
    public void spielen() {
        // Erzeuge Steinhaufen
        System.out.println("Ein Steinhaufen wird pro Runde zufaellig mit zwischen 20 und 30 Steinen erzeugt.\n" +
                "Der Spieler, der den letzten Stein aufnehmen muss, hat verloren.");
        boolean weiter = true;
        while (weiter) {
            steinhaufen = new Steinhaufen();
            // Bestimme Startspieler
            dran = Double.valueOf(Math.floor(Math.random() * 2d)).intValue();
            int steinAbzug;
            do {
                System.out.println("Auf dem Steinhaufen liegen noch "
                        + steinhaufen.getAnzahlSteine() +
                        " Steine. " + spieler[dran].getName() +
                        ", wieviel Steine möchtest Du vom Steinhaufen nehmen? Wähle zwischen 1 bis 3.");
                while (true) {
                    try {
                        //	Eingabe Spieler
                        if (!scanner.hasNextInt()) {
                            scanner.nextLine();
                            throw new IOException("Fehler! Eingabe war keine Zahl!");
                        }
                        steinAbzug = scanner.nextInt();
                        if (steinAbzug < 1 || steinAbzug > 3) {
                            throw new IOException("Fehler! Eingabe war nicht zwischen 1 und 3!");
                        }
                        break;
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
                dranSpieler();
            } while (steinhaufen.reduziereAnzahlSteine(steinAbzug));
            setGewinner();
            System.out.println("Gewinner dieser Runde: " + spieler[dran].getName());
            System.out.println("Möchten Sie weiterspielen? y/n");
            weiter = scanner.next().trim().equals("y");
        }

        int gewinner;
        if (anzahlGewinne[0] > anzahlGewinne[1]) {
            gewinner = 0;
        } else if (anzahlGewinne[0] < anzahlGewinne[1]) {
            gewinner = 1;
        } else {
            gewinner = -1;
        }
        anzahlSpielrunden = anzahlGewinne[0] + anzahlGewinne[1];
        if (gewinner >= 0 ) {
            System.out.println("Gewinner ist: " + spieler[gewinner].getName() + " (" + anzahlGewinne[gewinner] + ":" +  anzahlGewinne[(gewinner+1)%2] + ")");
        } else {
            System.out.println("Unentschieden! (" + anzahlGewinne[0] + ":" +  anzahlGewinne[1] + ")");
        }
        System.out.println("Anzahl der gespielten Runden: " + anzahlSpielrunden);
    }

    //---------- Private Methoden ------------


    /**
     * Fragt Spielernamen interaktiv ab
     * @param i  Spielernummer
     * @return Spielernamen
     */
    private String eingabe(int i) {
        System.out.println("Spieler " + i + ", bitte gib Deinen Namen ein!");
        return scanner.nextLine();
    }

    /**
     * Wechselt den aktiven Spieler
     */
    public void dranSpieler() {
        dran = (dran + 1) % 2;
    }

    /**
     * Setze den Gewinner
     */
    private void setGewinner() {
        anzahlGewinne[dran]++;
    }

}




	

	
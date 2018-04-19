/** Klasse SteinhaufenSpiel**/
import java.util.Scanner;

public class SteinhaufenSpiel {

    /**Attribute*/

    private Spieler[] spieler;
    private Steinhaufen steinhaufen;
    private int dran;
    private String gewinner;
    private int anzahlSpielrunden=0;

    public boolean weiter = true;

    Scanner scanner= new Scanner(System.in);


    public static void main(String[] args){

        //Erzeuge Feld von Spielern
        //Initialisieren Spieler


        Spieler[] spieler = new Spieler[2];
        //Bereitstellen Datenspeicher für jeden Spieler
        spieler[0] = new Spieler(eingabe());
        spieler[1] = new Spieler(eingabe());

        //Erzeuge Steinhaufen
        Steinhaufen steinhaufen = new Steinhaufen();

        while (weiter) {
            //Bestimme Startspieler
            dran = Math.floor(Math.random()*2d);
            boolean nochSteineDa = true;
            //Spielen
            while (nochSteineDa) {
                //Spieler nach Anzahl fragen
                System.out.println("Auf dem Steinhaufen liegen noch"
                        + getAnzahlSteine()+
                        "Steine." + spieler[dran].getname() +
                        ", wieviel Steine möchtest Du vom Steinhaufen nehmen? Wähle zwischen 1 bis 3.");

                //	Eingabe Spieler
                int a = scan.nextInt();
                nochSteineDa = redAnzahl(a);
            }

            //Setze Gewinner der Runde
            setGewinner();

            //Weiterspielen?

            if(weiter){
                steinhaufen.reset();


            }

        }

        anzahlSpielrunden= spieler[0].anzahlGewinne + spieler[1].anzahlGewinne;
        if (spieler[0].anzahlGewinne > spieler[1].anzahlGewinne) {
            gewinner = spieler[0].name;
        } else if (spieler[0].anzahlGewinne < spieler[1].anzahlGewinne) {
            gewinner = spieler[1].name;
        } else {
            gewinner = null;
        }

        System.out.println("Gewinner ist:" + gewinner +
                "\n Anzahl der gespielten Runden:"+ anzahlSpielrunden);
    }


    /**Einlesen Spielernamen*/
    public String eingabe() {
        System.out.println("Bitte gib Deinen Namen ein!");
        return scan.nextLine();
    }

    public int dranSpieler() {
        dran = (dran+1)%2;
        return dran;
    }

    public void setGewinner() {
        spieler[(dran + 1) % 2].anzahlGewinne++;
    }

}




	

	
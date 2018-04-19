/** Klasse SteinhaufenSpiel**/
import java.util.Scanner;

public class SteinhaufenSpiel {

/**Attribute*/

private Spieler[] spieler;
private Steinhaufen steinhaufen;
private int dran;
private int gewinner;
private int anzahlSpielrunden;

public static void main ( String [] args){


	/**Erzeugen Scanner*/
	Scanner scanner= new Scanner(System.in);

	/**Erzeugen Feld von Spielern*/

	spieler= new Spieler[2];
	//Bereitstellen Datenspeicher für jeden Spieler
	spieler[0]= new Spieler();
	spieler[1]= new Spieler();

	/**Einlesen Spielernamen*/
	for(int i=0; i<2;i++){
		System.out.println( "Spieler "+(i+1)+"Gib Deinen Namen ein!");
		spieler[i].name= scan.nextLine();
	}

	public int dranSpieler(){
		
		dran= (dran+1)%2
	}
	
	public int setGewinner(){
		
		gewinner= (dran+1)%2
	}
}

}


	

	
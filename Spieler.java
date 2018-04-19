/**
* Klasse Spieler
*/

public class Spieler{
/** Attribute
*Name des Spielers
*/
private String name = "";
public int anzahlGewinne=0;

/**
*Konstruktor Spieler
*/
public Spieler( String n){
	name= n;
	}
	
public String getName(){
	return name;
	}
}


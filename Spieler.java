// Spieler.java
import Tools.IO.*;

/**
* Klasse Spieler
*/

public class spieler{
/** Attribute
*Name des Spielers
*/
private String name = "";

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
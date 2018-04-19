//Steinhaufen.java
/**
*Steinhaufen
*/

public class SteinHaufen{
/** Attribute: Anzahl der vorhandenen Stein*/

private int anzahlSteine;

/**Konstruktor Steinhaufen*/
public Steinhaufen(){
	
	//Anfangsanzahl Steine zufällig
	anzahlSteine= (int)(Math.random()*11)+20;
	}

/**Instanzmethode getAnzahlSteine*/

public int getAnzahlSteine(){
	return anzahlSteine;
	}
	
/**Instanzmethode reduziere Steine*/

public boolean redAnzahlSteine(int n){
	anzahlSteine = anzahlSteine - n;
	if(anzahlSteine>0)
		return true;
	else
		return false;
	}

/**Neue Runde: Reset Steinhaufen*/

public void reset(){
	}
}
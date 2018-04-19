	//Erzeugen Feld von Spielern

	Spieler [] spieler= new Spieler[2];

	//Bereitstellen Datenspeicher für jeden Spieler
	spieler[0]= new Spieler();
	spieler[1]= new Spieler();

	//Einlesen Spielernamen
	for(int i=0; i<2;i++){
		System.out.println( "Spieler "+(i+1));
		spieler[i].name= IOTools.readLine("Wie ist Dein 		Name?");
		}
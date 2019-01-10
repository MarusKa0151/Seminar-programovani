public class KnihovnaAWH {
	public static void main(String[] args) {
		//pomalá, ale jednodušší
		//javac -cp awh.jar;. KnihovnaAWH.java
		//java -cp .;awh.jar KnihovnaAWH

		//Vytvoření prázdného obrázku
		//awh.Image obr = awh.Image.createEmpty(50, 50, awh.Color.GREEN);
		//obr.saveToFile("zeleny.png");
		
		//Načtení a převod obrázku
	    //awh.Image obr = awh.Image.loadFromFile(args[0]);
        //System.out.printf("Velikost %s: %dx%d\n", args[0], obr.getWidth(), obr.getHeight());
        //obr.saveToFile(args[1]); //přepíše to obrázek do jinýho (třeba i typu)
		//java -cp .;awh.jar KnihovnaAWH zeleny.png novy.jpg = musím zadat dva argumenty
	}
}
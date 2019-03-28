import java.util.Scanner;

public class TridaScanner {

	public static void main(String[] args) throws java.io.IOException {
		/*Nacitani z daneho souboru*/
		Scanner sc = new Scanner(java.nio.file.Paths.get("soubor"));
		sc.close();
		
		/*Nacitani z daneho textu*/
		Scanner sca = new Scanner("1 2 3 4 5 6");
		sca.close();
	}

}

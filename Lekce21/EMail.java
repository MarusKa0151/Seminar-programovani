import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class EMail {
	//dobre pouzit mapu
	
	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		Map<String, String> hlavicka = nactiHlavicku(vstup);
		vstup.close();
		
		System.out.printf("%s\n%s\n", hlavicka.get("subject"), hlavicka.get("from"));
	}
	
	public static Map<String, String> nactiHlavicku(Scanner vstup) {
		Map<String, String> vysledek = new HashMap<>();
		String posledniHodnota = "";
		String posledniKlic = null;
		while (vstup.hasNextLine()) {
			String radek = vstup.nextLine();
			if (radek.isEmpty()) {
				break;
			}
			
			boolean navazujici = radek.startsWith("    ") || radek.startsWith(" ");
			
			if (navazujici) {
				if (posledniKlic == null) {
					continue;
				}
				posledniHodnota += radek.trim(); //oseka to mezery okolo
			}
			else {
				vysledek.put(posledniKlic, posledniHodnota);
				String[] casti = radek.split(": ", 2);
				if (casti.length != 2) {
					continue;
				}
				posledniKlic = casti[0];
				posledniHodnota = casti[1].trim();
			}	
			if (posledniKlic != null) {
				vysledek.put(posledniKlic, posledniHodnota);
			}
		}
		return vysledek;
	}

}

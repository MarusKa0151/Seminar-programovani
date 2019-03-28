import java.util.Scanner;

//moc pomaly
//credits to hodiny programovani, Horky
public class ZalomeniTextu {
	private static final int MAX_SIRKA = 25;

	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		
		int sirkaRadku = 0;
		while (vstup.hasNextLine()) {
			String radek = vstup.nextLine();
			if (radek.isEmpty()) {
				System.out.print("\n\n");
				sirkaRadku = 0;
				continue;
			}
			
			Scanner slova = new Scanner(radek);
			while (slova.hasNext()) {
				String slovo = slova.next();
				if (slovo.length() + sirkaRadku < MAX_SIRKA) {
					if (sirkaRadku > 0) {
						System.out.print(" ");
						sirkaRadku++;
					}
					else {
						System.out.println();
						sirkaRadku = 0;
					}
					System.out.print(slovo);
					sirkaRadku += slovo.length();
				}
				slova.close();
			}
			if (sirkaRadku > 0) {
				System.out.println();
			}
			vstup.close();
		}
	}

}

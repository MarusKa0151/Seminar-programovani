import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.*;
import java.io.IOException;

public class ReadingZIP {
	public static void main(String[] args) throws IOException {
		boolean tiskniSeznam = false;
		String zipNazev = null;
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-t")) {
				tiskniSeznam = true;
			}
			else {
				zipNazev = args[i];
			}
		}
		
		if (zipNazev == null) {
			return;
		}
		
		if (tiskniSeznam) {
			ZipFile soubor = new ZipFile(zipNazev);
			Enumeration<? extends ZipEntry> soubory = soubor.entries();
			List<String> nazvy = new ArrayList<>();
			while (soubory.hasMoreElements()) {
				ZipEntry e = soubory.nextElement();
				nazvy.add(e.getName());
			}
			Collections.sort(nazvy);
			for (String nazev : nazvy) {
				System.out.println(nazev);
			}
			soubor.close();
		}
	}
}

import java.util.Deque;
import java.util.LinkedList;

public class Rada {
	static Deque<String> retezec = new LinkedList<String>();
	int zacatekPodretezce;
	int delkaPodretezce;
	int kolikatyKvasek;
	
	public Rada(Deque<String> vysledek, int kvasek, int kde, int delka) {
		retezec = vysledek;
		kolikatyKvasek = kvasek;
		zacatekPodretezce = kde;
		delkaPodretezce = delka;
	}
	public static void pridejZnak(String znak) {
		retezec.add(znak);		
	}
	public void odeberZacatek(int zacatek) {
		for (int i = 0; i < zacatek; i++) {
			retezec.removeFirst();
		}
	}
	public void vypisPodretezec(int delka) {
		for (int i = 0; i < delka; i++) {
			System.out.print(retezec.pop());
		}
	}
	public int zJednohoDve(int cislo) {
		if (cislo == 1) {
			int neco = 1;
			Rada.pridejZnak("Z");
			return neco;
		}
		else if (cislo == 2) {
			int neco = 0;
			Rada.pridejZnak("P");
			return neco;
		}
		else {
			int cislo1 = cislo - 2;
			int cislo2 = cislo - 1;
			int vysledek = zJednohoDve(cislo1) + zJednohoDve(cislo2);
			return vysledek;
		}
	}
}

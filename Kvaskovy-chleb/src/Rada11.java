import java.util.Deque;
import java.util.LinkedList;

public class Rada11 {
	static Deque<String> retezec = new LinkedList<String>();
	long zacatekPodretezce;
	long delkaPodretezce;
	long kolikatyKvasek;
	long aktualniIndex;
	int aktualniDelka;
	
	String kvasek15 = "ZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZP";
	String kvasek16 = "PZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZPPZPZPPZPZPPZPPZPZPPZP";
	
	public Rada11(Deque<String> vysledek, long kvasek, long kde, long delka) {
		retezec = vysledek;
		kolikatyKvasek = kvasek;
		zacatekPodretezce = kde;
		delkaPodretezce = delka;
	}
	public static void pridejZnak(String znak) {
		retezec.add(znak);		
	}
	public void odeberZacatek(long zacatek) {
		for (int i = 0; i < zacatek; i++) {
			retezec.removeFirst();
		}
	}
	public void vypisPodretezec(long delka) {
		for (int i = 0; i < delka; i++) {
			System.out.print(retezec.pop());
		}
	}
	public long zJednohoDve(long cislo) {
		if (cislo == 1) {
			long neco = 1;
			if (zacatekPodretezce <= aktualniIndex & aktualniIndex < zacatekPodretezce + delkaPodretezce) {
				System.out.print("Z");
			}
			aktualniIndex++;
			return neco;
		}
		else if (cislo == 2) {
			long neco = 0;
			if (zacatekPodretezce <= aktualniIndex & aktualniIndex < zacatekPodretezce + delkaPodretezce) {
				System.out.print("P");
			}
			aktualniIndex++;
			return neco;
		}
		else {
			long cislo1 = cislo - 2;
			long cislo2 = cislo - 1;
			long vysledek = zJednohoDve(cislo1) + zJednohoDve(cislo2);
			return vysledek;
		}
	}
	public long zJednohoDveProVetsi(long cislo) {
		if (cislo == 74 & aktualniIndex + Long.valueOf("1304969544928660") < zacatekPodretezce) {
			String a = "1304969544928660";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		
		else if (cislo == 73 & aktualniIndex + Long.valueOf("806515533049393") < zacatekPodretezce) {
			String a = "806515533049393";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 78 & aktualniIndex + Long.valueOf("8944394323791460") < zacatekPodretezce) {
			String a = "8944394323791460";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 77 & aktualniIndex + Long.valueOf("5527939700884760") < zacatekPodretezce) {
			String a = "5527939700884760";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 76 & aktualniIndex + Long.valueOf("3416454622906710") < zacatekPodretezce) {
			String a = "3416454622906710";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 75 & aktualniIndex + Long.valueOf("2111485077978050") < zacatekPodretezce) {
			String a = "2111485077978050";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 72 & aktualniIndex + Long.valueOf("498454011879264") < zacatekPodretezce) {
			String a = "498454011879264";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 71 & aktualniIndex + Long.valueOf("308061521170129") < zacatekPodretezce) {
			String a = "308061521170129";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 70 & aktualniIndex + Long.valueOf("190392490709135") < zacatekPodretezce) {
			String a = "190392490709135";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 69 & aktualniIndex + Long.valueOf("117669030460994") < zacatekPodretezce) {
			String a = "117669030460994";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		
		else if (cislo == 68 & aktualniIndex + Long.valueOf("72723460248141") < zacatekPodretezce) {
			String a = "72723460248141";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 67 & aktualniIndex + Long.valueOf("44945570212853") < zacatekPodretezce) {
			String a = "44945570212853";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 66 & aktualniIndex + Long.valueOf("27777890035288") < zacatekPodretezce) {
			String a = "27777890035288";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 65 & aktualniIndex + Long.valueOf("17167680177565") < zacatekPodretezce) {
			String a = "17167680177565";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 64 & aktualniIndex + Long.valueOf("10610209857723") < zacatekPodretezce) {
			String a = "10610209857723";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 63 & aktualniIndex + Long.valueOf("6557470319842") < zacatekPodretezce) {
			String a = "6557470319842";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 62 & aktualniIndex + Long.valueOf("4052739537881") < zacatekPodretezce) {
			String a = "4052739537881";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 61 & aktualniIndex + Long.valueOf("2504730781961") < zacatekPodretezce) {
			String a = "2504730781961";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 60 & aktualniIndex + Long.valueOf("1548008755920") < zacatekPodretezce) {
			String a = "1548008755920";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 59 & aktualniIndex + Long.valueOf("956722026041") < zacatekPodretezce) {
			String a = "956722026041";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 58 & aktualniIndex + Long.valueOf("591286729879") < zacatekPodretezce) {
			String a = "591286729879";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 57 & aktualniIndex + Long.valueOf("365435296162") < zacatekPodretezce) {
			String a = "365435296162";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 56 & aktualniIndex + Long.valueOf("225851433717") < zacatekPodretezce) {
			String a = "225851433717";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 55 & aktualniIndex + Long.valueOf("139583862445") < zacatekPodretezce) {
			String a = "139583862445";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}	
		else if (cislo == 54 & aktualniIndex + Long.valueOf("86267571272") < zacatekPodretezce) {
			String a = "86267571272";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 53 & aktualniIndex + Long.valueOf("53316291173") < zacatekPodretezce) {
			String a = "53316291173";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 52 & aktualniIndex + Long.valueOf("32951280099") < zacatekPodretezce) {
			String a = "32951280099";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 51 & aktualniIndex + Long.valueOf("20365011074") < zacatekPodretezce) {
			String a = "20365011074";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 50 & aktualniIndex + Long.valueOf("12586269025") < zacatekPodretezce) {
			String a = "12586269025";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 49 & aktualniIndex + Long.valueOf("7778742049") < zacatekPodretezce) {
			String a = "7778742049";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 48 & aktualniIndex + Long.valueOf("4807526976") < zacatekPodretezce) {
			String a = "4807526976";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 47 & aktualniIndex + Long.valueOf("2971215073") < zacatekPodretezce) {
			String a = "2971215073";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 46 & aktualniIndex + Long.valueOf("1836311903") < zacatekPodretezce) {
			String a = "1836311903";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 45 & aktualniIndex + Long.valueOf("1134903170") < zacatekPodretezce) {
			String a = "1134903170";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 44 & aktualniIndex + Long.valueOf("701408733") < zacatekPodretezce) {
			String a = "701408733";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 43 & aktualniIndex + Long.valueOf("433494437") < zacatekPodretezce) {
			String a = "433494437";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 42 & aktualniIndex + Long.valueOf("267914296") < zacatekPodretezce) {
			String a = "267914296";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 41 & aktualniIndex + Long.valueOf("165580141") < zacatekPodretezce) {
			String a = "165580141";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 40 & aktualniIndex + Long.valueOf("102334155") < zacatekPodretezce) {
			String a = "102334155";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 39 & aktualniIndex + Long.valueOf("63245986") < zacatekPodretezce) {
			String a = "63245986";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 38 & aktualniIndex + Long.valueOf("39088169") < zacatekPodretezce) {
			String a = "39088169";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 37 & aktualniIndex + Long.valueOf("24157817") < zacatekPodretezce) {
			String a = "24157817";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 36 & aktualniIndex + Long.valueOf("14930352") < zacatekPodretezce) {
			String a = "14930352";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 35 & aktualniIndex + Long.valueOf("9227465") < zacatekPodretezce) {
			String a = "9227465";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 34 & aktualniIndex + Long.valueOf("5702887") < zacatekPodretezce) {
			String a = "5702887";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 33 & aktualniIndex + Long.valueOf("3524578") < zacatekPodretezce) {
			String a = "3524578";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 32 & aktualniIndex + Long.valueOf("2178309") < zacatekPodretezce) {
			String a = "2178309";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 31 & aktualniIndex + Long.valueOf("1346269") < zacatekPodretezce) {
			String a = "1346269";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 30 & aktualniIndex + Long.valueOf("832040") < zacatekPodretezce) {
			String a = "832040";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 29 & aktualniIndex + Long.valueOf("514229") < zacatekPodretezce) {
			String a = "514229";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 28 & aktualniIndex + Long.valueOf("317811") < zacatekPodretezce) {
			String a = "317811";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 27 & aktualniIndex + Long.valueOf("196418") < zacatekPodretezce) {
			String a = "196418";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 26 & aktualniIndex + Long.valueOf("121393") < zacatekPodretezce) {
			String a = "121393";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 25 & aktualniIndex + Long.valueOf("75025") < zacatekPodretezce) {
			String a = "75025";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 24 & aktualniIndex + Long.valueOf("46368") < zacatekPodretezce) {
			String a = "46368";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 23 & aktualniIndex + Long.valueOf("28657") < zacatekPodretezce) {
			String a = "28657";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 22 & aktualniIndex + Long.valueOf("17711") < zacatekPodretezce) {
			String a = "17711";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 21 & aktualniIndex + Long.valueOf("10946") < zacatekPodretezce) {
			String a = "10946";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		else if (cislo == 20 & aktualniIndex + Long.valueOf("6765") < zacatekPodretezce) {
			String a = "6765";
			long b = Long.parseLong(a);
			aktualniIndex += b;
			return 1;
		}
		
		//dodelat
			
		else if (cislo == 15) {
			if (zacatekPodretezce <= aktualniIndex & aktualniIndex < zacatekPodretezce + delkaPodretezce) {
				if (aktualniDelka + 610 < delkaPodretezce) {
					System.out.print(kvasek15);
					aktualniDelka = aktualniDelka + 610;
					aktualniIndex += 610;
				}
				else {
					int delka = (int) delkaPodretezce;
					System.out.print(kvasek15.substring(0, delka - aktualniDelka));
					aktualniIndex = aktualniIndex + delka - aktualniDelka;
					aktualniDelka = delka;
				}
			}
			else {
				aktualniIndex += 610;
			}
			return 1;
		}
		else if (cislo == 16) {
			if (zacatekPodretezce <= aktualniIndex & aktualniIndex < zacatekPodretezce + delkaPodretezce) {
				if (aktualniDelka + 987 < delkaPodretezce) {
					System.out.print(kvasek16);
					aktualniDelka = aktualniDelka + 987;
					aktualniIndex += 987;
				}
				else {
					int delka = (int) delkaPodretezce;
					System.out.print(kvasek16.substring(0, delka - aktualniDelka));
					aktualniIndex = aktualniIndex + delka - aktualniDelka;
					aktualniDelka = delka;		
				}
			}
			else {
				aktualniIndex += 987;
			}
			return 1;
		}
		else {
			long cislo1 = cislo - 2;
			long cislo2 = cislo - 1;
			long vysledek = zJednohoDve(cislo1) + zJednohoDve(cislo2);
			return vysledek;
		}
	}
}

import java.util.Deque;
import java.util.LinkedList;
//problem: out of memory

public class Pokus10 {
	public static void main(String[] args) {
		int kolikatyKvasek = Integer.parseInt(args[0]);
		int pocatekPodretezce = Integer.parseInt(args[1]);
		int delkaPodretezce = Integer.parseInt(args[2]);
		Deque<String> retezec = new LinkedList<>();
		
		Rada rada = new Rada(retezec, kolikatyKvasek, pocatekPodretezce, delkaPodretezce);
		int randomNumber = rada.zJednohoDve(kolikatyKvasek);		
		rada.odeberZacatek(pocatekPodretezce);
		rada.vypisPodretezec(delkaPodretezce);
		//System.out.print(randomNumber);
	}
	
	
}

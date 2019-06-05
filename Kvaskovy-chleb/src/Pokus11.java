import java.util.Deque;
import java.util.LinkedList;

public class Pokus11 {
	public static void main(String[] args) {
		long kolikatyKvasek = Long.parseLong(args[0]);
		long pocatekPodretezce = Long.parseLong(args[1]);
		long delkaPodretezce = Long.parseLong(args[2]);
		Deque<String> retezec = new LinkedList<>();
		
		Rada11 rada = new Rada11(retezec, kolikatyKvasek, pocatekPodretezce, delkaPodretezce);
		//long randomNumber = rada.zJednohoDve(kolikatyKvasek);
		long randomNumber = rada.zJednohoDveProVetsi(kolikatyKvasek);
		/*
		rada.odeberZacatek(pocatekPodretezce);
		rada.vypisPodretezec(delkaPodretezce);
		*/
		
	}
}

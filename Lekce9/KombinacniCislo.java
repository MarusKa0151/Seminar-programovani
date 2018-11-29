public class KombinacniCislo {
	//does not work for factorials >20
	public static void main(String[] args) {
		
		long k = Integer.parseInt(args[0]);
		long n = Integer.parseInt(args[1]);
		
		if (k > n || k < 0 || n < 0) {
			System.out.print("This does not work.");
		}
		else {
			long result = (factorial(n)) / (factorial(n - k) * factorial(k));
			System.out.print(result);
		}
	}
	
	//calculating factorial
	public static long factorial (long i) {
		if (i == 0 || i == 1) {
			return 1;
		}
		
		else {
			return (factorial(i - 1) * i);
		}
	}
}
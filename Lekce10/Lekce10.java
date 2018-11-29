public class Lekce10 {
    /* 
    for more options: int... numbers
    k parametrům přistupujeme jako k poli, ale volající je normálně vyjmenuje:
    */
    public static int min(int... cisla) {
        int vysl = cisla[0];
        for (int i = 1; i < cisla.length; i++) {
            if (cisla[i] < vysl) {
                vysl = cisla[i];
            }
        }
        return vysl;
    }
}
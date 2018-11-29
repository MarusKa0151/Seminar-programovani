public class ObjektoveOrientovaneProgramovani {
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
    /*
Objektově orientované programování
    - přístup k programování
    - objekt jako datový typ
    - zapouzření, dědičnost, polymorfismus
    - objekt vs. třída vs. instance
!   - objekt je konkrétní instance ("prvek") třídy = například objekt bude konkrétní strom, třída budou všechny stromy

Zapouzdření
    - spojení dat a příslušných funkcí
    - atributy a metody
    - metody mají viditelnost, která určuje, kdo je může volat
        jen z ostatních metod téže třídy
            pomocné funkce, mohou se spolehnout na vstup
        jako předchozí + navíc metody předků
            pomocné funkce, co se mohou hodit i předkům
        kdokoliv
            nutná kontrola dat
    - u atributů lze též určit viditelnost
        dobré pravidlo je, že na atributy smí sáhnout pouze daná třída
        přístup k nim je přes metody (tzv. gettery a settery)

Různé poznámky
    - třídy mi umožní skrýt implementaci
    - lze pracovat stylem "mám objekt, který se umí nakreslit", ale
        nemusím vědět, jak se nakreslí
        nemusím řešit, kam se nakreslí
    - vytvoření objektu: konstruktor
        spousta skryté práce, kterou připraví překladač

Statické atributy a metody
    - patří ke třídě, nikoliv k objektu
    - např. třída pro matematické funkce
        nepotřebuji instanci matematiky, stačí mi funkcionalita
    - dosud všechny námi vytvářené metody

OOP v Javě
    - co soubor, to třída
    - metody už známe
    - atributy jsou proměnné zapsané mimo třídu
!   - přes tečku se dostávám k metodě toho objektu
    - viditelnost
        private = nikdo mi do toho nemůže šahat, protected, public
!       např. private int měsíc, aby mi nikdo nezměnil počet měsíců, aby mi to nerozbil
    - statické atributy: static
        main() je statická, protože je to tak nejjednodušší
!       dává smysl i bez existence objektu, zeptám se jestli umí
    - konstruktor: metoda se stejným jménem jako je jméno třídy (bez návratového typu)
    - this: proměnnou s aktuálním objektem (instancí)
    - super: volání na předkovi

    */
    public static void main(String[] args) {
        Kalendar kal = new Kalendar(2015, 11, 12);
        if (kal.jePrestupnyRok()) {
            /* Interne se zavola kal.toString() */
            System.out.printf("%s je z prestupneho roku.\n", kal);
        } else {
            System.out.printf("%s neni z prestupneho roku.\n", kal);
        }
    }
/*public class Kalendar {
    pokud pojmenuji metodu stejně, tak se zavolá, pokud zavolám new
*/
    private int den;
    private int mesic;
    private int rok;
    public Kalendar(int r, int m, int d) {
        rok = r;
        mesic = m;
        den = d;
    }

    public boolean jePrestupnyRok() {
        boolean delitelny4 = (rok % 4) == 0;
        boolean delitelny100 = (rok % 100) == 0;
        boolean delitelny400 = (rok % 400) == 0;
            if (delitelny400) {
                return true;
            } else if (delitelny100) {
                return false;
            } else {
                return delitelny4;
            }
    } 
    /* potřebuju to, aby mi to soubor, co není string vytisklo, i když to není string a volám to jako string, tak se to přepíše na string
!   slušnost to tam psát
    */ 
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", rok, mesic, den);
    }
}
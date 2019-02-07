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
    - vytvoření objektu: konstruktor = jmenuje se jako třída
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
!   - this: proměnnou s aktuálním objektem (instancí), do konstruktoru, jakoby říká priritu, co to má brát na konec, aby s tím pracoval? 
        prostě nepojmenovávat parametry jako atributy
    - super: volání na předkovi

!   dobré si vytvořit třídu s užitečnými funkcemi, pak volám např. užitečnéFunkce.faktoriál = tohle platí pro třídy ve stejném projektu
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


/*
Balíčky (packages)

    další členění programů (jejich částí) do logických skupin
        metoda, třída, balíček
    balíček je určen v záhlaví programu

package mujbalicek;
public class TridaVMemBalicku {
}

konvence jmen balíčků
        malá písmena (třídy začínají velkým písmenem)
        odvozeny od domovské stránky
            např. com.google.blablabla
            pro naše účely můžeme používat např. cz.alej.prog.prijmeni.lekceX
        (pod)balíčky jsou oddělené tečkou
            IDE většinou vyžaduje novou vrstvou adresářů
        pod java. jsou tzv. systémové balíčky (např. Scanner je v java.util)
    důvody
        další logické členění
        prevence kolize jmen
        organizace souborů na disku
    pokud balíček uveden není, jde o tzv. default package, který je prázdný
    používání java.util.Scanner bylo použití třídy Scanner z balíčku java.util
    ušetření psaní
        abychom nevypisovali vždy celé jméno balíčku (protože úrovní vnoření je často kolem 5-8)
        deklarace import na začátku souboru

spuštění souboru Priklad.java - "java cz.alisma.alej.prog.lekceXY.Priklad"
*/



/*
Rozhraní (interface)

    koncept skrytí implementace, vidíme jen vnější chování
        chci něco, do čeho můžu zapsat výsledek
            v ten okamžik mě nezajímá, kam se výsledek zapíše
                disk, obrazovka, síť, ...
            ani jak je to udělané
                kde je ten soubor, jestli je to přes TCP nebo UDP, ...
        metoda chce něco, co umí zapsat výsledek
            programátor té metody neví, kam to bude
            při volání se rozhodnu, kam se to zapíše
    definuje protokol chování
        jen seznam metod, bez implementace
    
    public interface MyPrinter extends QuadraticEquationPrinter = dává Quadratic... do rozhraní MyPrinter
    
    public class HtmlPrinter implements MyPrinter = Html... využívá rozhraní MyPrinter, jen už jim dává určité hodnoty
 */


 /*
 EXISTUJÍ I VNOŘENÉ TŘÍDY
 private static class (má k ní přístup ta hlavní třída, ale už ne ty další, protože je private; mohla by být i public)
 */


 /* Collections List
    List<String> novy = new ArrayList<>(); = pole
    List<String> novy = new LinkedList<>(); = spoják
    novy.add(prvek) = přidá prvek
    novy.get(pozice) = vezme prvek na pozici

    Collections Map
    Map<Character, String> morse = new HashMap<>(); 
    morse.put("a", ".-"); = přidá dvojici
    for (char c : s)
        String code = abeceda.get(c); = vyhledá první znak a dostaneme ten druhý
    morse.containsKey(c) = vrati jestli to je nebo neni uz v mape
    morse.keySet() = všechny klíče HashMapy   
  */


  /*
POLYMORFISMUS
    - polymorfismus: která metoda se zavolá bude určeno až za běhu programu
    - interně si věc lze představit tak, že překladač přidá ke každému objektu informace o jeho typu (níže dostupné funkcí typeof)
    a každé polymorfní volání je vlastně série if-ů
        - ve skutečnosti je použita tzv. tabulka virtuálních metod, která je incializovaná v konstruktoru
        a na daném místě se použije pouze skok do této tabulky, ale pro přiblížení, jak to na pozadí funguje
        si můžeme klidně přestavit ty ify

DĚDIČNOST
    = inheritance
    - používá se často jrn pro sdílení kódu (předek může používat kód potomka)
    - dobrá rada: snažte se ji spíše vyhýbat: používejte rozhraí a malé třídy
    potřebuji reprezentovat geometrické tvary (v závorce jsou atributy vč. zděděných)
    - příklad:
    Tvar (x, y, barva)
        Usecka (x, y, barva -- x2, y2)
        Krivka (x, y, barva -- ostatní body)
        Vyplnene (x, y, barva -- barva_vyplne)
            Kruh (x, y, barva, barva_vyplne -- polomer)
            Obdelnik (x, y, barva, barva_vyplne -- sirka, vyska)
  */
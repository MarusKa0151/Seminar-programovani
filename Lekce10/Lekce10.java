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
    /*
Objektově orientované programování
    - přístup k programování
    - objekt jako datový typ
    - zapouzření, dědičnost, polymorfismus
    - objekt vs. třída vs. instance
    
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



    */
}
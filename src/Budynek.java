/* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

interface Budynek {
    double powierzchnia (double powBudynku, double powPodworka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
    void liczbaOkien(int valueO); // użycie jak setter
    void liczbaMieszkancow(int valueM); // użycie jak setter
    void kolorDomu(KolorEnum kolor); // użycie jak setter
    //double wyliczCene(double powierzchnia, double cena);
    //void stanDomu (StanEnum stan);
    //void ekspozycjaOkien (EkspozycjaEnum ekspozycja);



    enum KolorEnum {czerwony, zielony, niebieski, biały, żółty, pomarańczowy};
    enum StanEnum {zły, średni, dobry, wyśmienity}
    enum EkspozycjaEnum {północ, południe, wschód, zachód}
}


/* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */


public class Dom implements Budynek {
    private double powBudynku; private double powPodworka; private double powParkingu; //powierzchnia
    private String miejscowosc; private String ulica; private int nrDomu; private String nrLokalu; private String kodPocztowy; //adresBudynku
    int valueO; //liczbaOkien
    int valueM; //void liczbaMieszkancow(int valueM);
    KolorEnum kolorDomu; //void kolorDomu(KolorEnum kolor);


    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu)
    {
        this.powBudynku = powBudynku; this.powPodworka = powPodworka; this.powParkingu = powParkingu;
        return powBudynku+powPodworka+powParkingu;
    }

    @Override
    public String adresBudynku (String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy)
    {
        this.miejscowosc = miejscowosc; this.ulica = ulica; this.nrDomu = nrDomu; this.nrLokalu = nrLokalu; this.kodPocztowy = kodPocztowy;
        return miejscowosc+" "+ulica+" "+nrDomu+" "+nrLokalu+" "+kodPocztowy;
    }

    @Override
    public void liczbaOkien(int valueO)
    {
        this.valueO = valueO;
    }

    @Override
    public void liczbaMieszkancow(int valueM)
    {
        this.valueM = valueM;
    }

    @Override
    public void KolorDomu(KolorEnum kolor)
    {
        this.kolorDomu = kolor;
    }



};



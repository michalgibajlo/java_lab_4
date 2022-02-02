/* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */


public class Dom implements Budynek {
    private double powBudynku; private double powPodworka; private double powParkingu; //powierzchnia
    private String miejscowosc; private String ulica; private String nrDomu; private String nrLokalu; private String kodPocztowy; //adresBudynku
    int valueO; //liczbaOkien
    int valueM; //void liczbaMieszkancow(int valueM);
    private KolorEnum kolor; //void kolorDomu(KolorEnum kolor);
    private StanEnum stan; //void stanDomu (StanEnum stan);
    private EkspozycjaEnum ekspozycja; //void ekspozycjaOkien (EkspozycjaEnum ekspozycja);
    private double cena; //double wyliczCene(double powierzchnia, double cena);

    public Dom(
            double powBudynku, double powPodworka, double powParkingu,
            String miejscowosc, String ulica, String nrDomu, String nrLokalu, String kodPocztowy,
            int valueOkna, int valueMieszkancy, KolorEnum kolor)
    {
        this.powBudynku = powBudynku; this.powPodworka = powPodworka; this.powParkingu = powParkingu;
        this.miejscowosc = miejscowosc; this.ulica = ulica; this.nrDomu = nrDomu; this.nrLokalu = nrLokalu; this.kodPocztowy = kodPocztowy;
        this.valueO = valueOkna; this.valueM = valueMieszkancy;
        this.kolor = kolor;
    }


    public double getPowBudynku() {
        return powBudynku;
    }
    public double getPowPodworka() {
        return powPodworka;
    }
    public double getPowParkingu() {
        return powParkingu;
    }
    public String getMiejscowosc() {
        return miejscowosc;
    }
    public String getUlica() {
        return ulica;
    }
    public String getNrLokalu() {
        return nrLokalu;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public int getValueOkna() {
        return valueO;
    }
    public int getValueMieszkancy() {
        return valueM;
    }
    public KolorEnum getKolor() {
        return kolor;
    }
    public StanEnum getStan() {
        return stan;
    }
    public EkspozycjaEnum getekspozycjaOkien() {
        return ekspozycja;
    }

    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        return powBudynku + powPodworka + powParkingu;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
    }

    @Override
    public void stanDomu(StanEnum stan) {
    }

    @Override
    public void ekspozycjaOkien(EkspozycjaEnum stan) {
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, String nrDomu, String nrLokalu, String kodPocztowy) {
        return ulica + " " + nrDomu + "/" + nrLokalu + " " + miejscowosc + " " + kodPocztowy;
    }

    @Override
    public void liczbaOkien(int valueOkna) {
    }

    @Override
    public void liczbaMieszkancow(int valueMieszkancy) {
    }

    @Override
    public double wyliczCene(double powierzchnia, double cena) {
        return powierzchnia * cena;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "powBudynku=" + powBudynku +
                ", powPodworka=" + powPodworka +
                ", powParkingu=" + powParkingu +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", kolor=" + kolor +
                '}';
    }
};



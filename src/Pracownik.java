public class Pracownik implements PracownikI{
    private String imie;
    private String nazwisko;
    private double wynagrodzenie;
    private int staz;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, double wynagrodzenie, int staz, String stanowisko)
    {this.imie = imie; this.nazwisko = nazwisko; this.wynagrodzenie = wynagrodzenie; this.staz = staz; this.stanowisko = stanowisko;}

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public double getWynagrodzenie()
    {
        return wynagrodzenie;
    }

    public int getStaz()
    {
        return staz;
    }

    public String getStanowisko()
    {
        return stanowisko;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void setWynagrodzenie(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }

    public void setStaz(int staz)
    {
        this.staz = staz;
    }

    public void setStanowisko(String stanowisko)
    {
        this.stanowisko = stanowisko;
    }

    @Override
    public double wynagrodzenie(double wynagrodzenie)
    {
        return 0;
    }

    @Override
    public int staz(int staz)
    {
        return 0;
    }

    @Override
    public String stanowisko(String stanowisko)
    {
        return null;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                ", staz=" + staz +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}

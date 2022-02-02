public class Student implements StudentI{
    private String imie;
    private String nazwisko;
    private int indeks;
    private String kierunek;
    private int rok;

    public Student(String imie, String nazwisko, int indeks, String kierunek, int rok)
    {this.imie = imie; this.nazwisko = nazwisko; this.indeks = indeks; this.kierunek = kierunek; this.rok = rok;}

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public int getIndeks()
    {
        return indeks;
    }

    public String getKierunek()
    {
        return kierunek;
    }

    public int getRok()
    {
        return rok;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(int indeks)
    {
        this.indeks = indeks;
    }

    public void setKierunek(String kierunek)
    {
        this.kierunek = kierunek;
    }

    public void setRok(int rok)
    {
        this.rok = rok;
    }

    @Override
    public String imie(String imie)
    {
        return null;
    }
    @Override
    public String nazwisko(String nazwisko)
    {
        return null;
    }

    @Override
    public int indeks(int indeks)
    {
        return 0;
    }

    @Override
    public String kierunek(String kierunek)
    {
        return null;
    }

    @Override
    public int rok(int rok)
    {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks=" + indeks +
                ", kierunek='" + kierunek + '\'' +
                ", rok=" + rok +
                '}';
    }
}

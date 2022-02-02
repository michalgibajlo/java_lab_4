/*
c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
d) zadeklarować 3 metody,
 */

public interface StudentI extends CzlowiekI{
    int indeks(int indeks);
    String kierunek(String kierunek);
    int rok(int rok);
}

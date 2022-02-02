import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        int[] tab = {1, 2, 3, 4, 5, 6};
        Scanner scan = new Scanner(System.in);
        boolean indexcheck = false;

        System.out.println("Wprowadź numer indeksu tabeli (0-5): ");
        int i;

        try
        {
            while (indexcheck==false) {

                try {
                    i = scan.nextInt();
                    if (i >= 0 && i <= 5) {
                        System.out.println(tab[i]);
                        indexcheck = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Błąd, podaj cyfrę!");
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Błąd, podałeś liczbę spoza zakresu. Obsługiwane są liczby od 0 do " + (tab.length - 1));
                }
            }
        }
        finally
        {
            System.out.println("Kończenie pracy programu");
        }







        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

    }
}

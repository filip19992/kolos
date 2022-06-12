package ex3;

import ex3.pracownik.Planista;
import ex3.pracownik.Pracownik;
import ex3.pracownik.Recepcjonista;
import ex3.zlecenie.RejestrZlecen;
import ex3.zlecenie.Zlecenie;

public class TestApp {
    public static void main(String[] args) {
        Planista planista = new Planista("Jan", "Kowalski",1);
        Pracownik pracownik = new Pracownik("Grzegorz", "Trala", 2);
        Recepcjonista recepcjonista = new Recepcjonista(123123543, "Maciej", "Ziemowit");

        RejestrZlecen rejestrZlecen = new RejestrZlecen();
        rejestrZlecen.dodajZlecenie(new Zlecenie("2022", 1, "W trakcie"));

        //Jest nullem moglem Rejestr Zlecen dodac w konstruktorze ale nie zgadzaloby sie z diagramem
        planista.podejrzyjRejestrZlecen();
    }
}

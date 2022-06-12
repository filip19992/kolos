package ex3.pracownik;

import ex3.zlecenie.RejestrZlecen;
import ex3.zlecenie.Zlecenie;

import java.util.List;

public class Pracownik {
    private String imie;
    protected String nazwisko;
    private int idPracownika;
    public List<String> zadania;

    private RejestrZlecen rejestrZlecen;

    public Pracownik(String imie, String nazwisko, int idPracownika) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.idPracownika = idPracownika;
    }
    public void zmienStatusZlecenia(int idZlecenia, String nowyStatus){

        List<Zlecenie> zlecenia = rejestrZlecen.getZlecenia();

        for (Zlecenie zlecenie : zlecenia) {
            if (zlecenie.getIdZlecenia() == idZlecenia) {
                zlecenie.setStatus(nowyStatus);
            } else {
                System.out.println("Nie ma zlecenia z tym id");
            }
        }
    }
    }

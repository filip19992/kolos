package ex3.pracownik;

import ex3.zlecenie.RejestrZlecen;
import ex3.zlecenie.Zlecenie;

import java.util.List;
import java.util.Map;

public class Planista {
    private String imie;
    protected String naziwsko;
    private int idPlanisty;

    Map<String, String> zadania;

    RejestrZlecen rejestrZlecen;

    public Planista(String imie, String naziwsko, int idPlanisty) {
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.idPlanisty = idPlanisty;
    }

    public void podejrzyjRejestrZlecen() {
        System.out.println(rejestrZlecen.getZlecenia());
    }

    public void pokazZadania() {
        System.out.println(zadania);
    }

    public void przydzielZleceniaPracownikowi(int idPracownika, String string){


    }
}

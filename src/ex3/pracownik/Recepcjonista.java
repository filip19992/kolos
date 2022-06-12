package ex3.pracownik;

import ex3.zlecenie.RejestrZlecen;
import ex3.zlecenie.Zlecenie;

public class Recepcjonista {
    private int nip;
    private String imie;
    private String naziwsko;

    private RejestrZlecen rejestrZlecen;

    public Recepcjonista(int nip, String imie, String naziwsko) {
        this.nip = nip;
        this.imie = imie;
        this.naziwsko = naziwsko;
    }

    public void dodajZlecenie(int idZlecenie, String data, String status){
        Zlecenie zlecenie = new Zlecenie(data,idZlecenie,status);
        rejestrZlecen.dodajZlecenie(zlecenie);
    }
}

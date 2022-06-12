package ex3.zlecenie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RejestrZlecen {
     List<Zlecenie> zlecenia = new ArrayList<>();

    public RejestrZlecen() {
    }

    public void usunZlecenie(int id) {
        for (int i = 0; i < zlecenia.size(); i++) {
            if(zlecenia.get(i).getIdZlecenia()==id){
                zlecenia.remove(i);
            } else {
                System.out.println("Nie ma zlecenia z tym id");
            }
        }
    }

    //Metoda dodana przez mnie poniewaz nie bylo jej na diagramie a byla potrzebna
    public void dodajZlecenie(Zlecenie zlecenie) {
        zlecenia.add(zlecenie);
    }

    public void posortujZlecenia() {
        zlecenia.sort(Comparator.comparing(Zlecenie::getIdZlecenia));
    }

    public List<Zlecenie> getZlecenia() {
        return zlecenia;
    }
}


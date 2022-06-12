package ex3.zlecenie;

public class Zlecenie {
    private String dataUtworzenia;
    private int idZlecenia;
    private String status;

    private RejestrZlecen rejestrZlecen;

    public Zlecenie(String dataUtworzenia, int idZlecenia, String status) {
        this.dataUtworzenia = dataUtworzenia;
        this.idZlecenia = idZlecenia;
        this.status = status;
    }

    public int getIdZlecenia() {
        return idZlecenia;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

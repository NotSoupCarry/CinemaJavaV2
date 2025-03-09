package Models;

public abstract class Utente {
    private int id;
    private String nomeUtente;
    private String ruolo;

    public Utente(int id, String nomeUtente, String ruolo) {
        this.id = id;
        this.nomeUtente = nomeUtente;
        this.ruolo = ruolo;
    }

    public int getId() {
        return id;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getRuolo() {
        return ruolo;
    }

}

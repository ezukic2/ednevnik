package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Ucenik {
    private int id;
    private String ime;
    private String prezime;
    private String username;
    private String password;
    private String ocjene;
    private int razred_id;


    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOcjene() {
        return ocjene;
    }

    public void setOcjene(String ocjene) {
        this.ocjene = ocjene;
    }

    public int getRazred_id() {
        return razred_id;
    }

    public void setRazred_id(int razred_id) {
        this.razred_id = razred_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "id. " + id +
                ", ime: " + ime + ", prezime:" + prezime + ", razred: " + getRazred_id() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ucenik djak = (Ucenik) o;
        return id == djak.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ime);
    }
}

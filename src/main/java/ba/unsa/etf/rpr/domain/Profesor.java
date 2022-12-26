package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Profesor {
    private int id;
    private String ime;
    private String prezime;
    private String username;
    private String password;
    private String razred;


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

    public String getRazred() {
        return razred;
    }

    public void setRazred(String razred) {
        this.razred = razred;
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
                ", ime: " + ime + ", prezime:" + prezime + ", razred: " + razred + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor prof = (Profesor) o;
        return id == prof.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ime);
    }
}

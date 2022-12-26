package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Razred {
    private int id;
    private int profesor_id;

    public int getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "razred:  " + id + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Razred c = (Razred) o;
        return id == c.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id);
    }

}

package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Profesor;
import ba.unsa.etf.rpr.domain.Razred;
import ba.unsa.etf.rpr.domain.Ucenik;

import java.util.List;

public interface RazredDao extends Dao<Razred> {

    List<Ucenik> pretragaPoImenuUcenika(String name);
    List<Profesor> pretragaPoImenuProfesora(String text);
}

package univ.lorraine.notes.service;

import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.model.Type;

import java.util.List;

public interface IThemeService {

    List<Theme> findall();

    Theme save(Theme theme);

    Theme findById(int id);

    void delete(Theme theme);
}

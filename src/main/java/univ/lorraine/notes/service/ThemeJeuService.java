package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.ThemeJeu;
import univ.lorraine.notes.repository.ThemeJeuRepository;

import java.util.List;

@Service
public class ThemeJeuService implements IThemeJeuService {

    @Autowired
    private ThemeJeuRepository themeJeuRepository;

    @Override
    public List<ThemeJeu> findall() {
        return (List<ThemeJeu>) themeJeuRepository.findAll();
    }
}

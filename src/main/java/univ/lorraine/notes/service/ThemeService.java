package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.model.Jeu;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.repository.ThemeRepository;

import java.util.List;

@Service
public class ThemeService implements IThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Autowired
    private JeuService jeuService;

    @Override
    public List<Theme> findall() {
        return (List<Theme>) themeRepository.findAll();
    }

    @Override
    public Theme save(Theme theme) { return (Theme) themeRepository.save(theme);}

    @Override
    public Theme findById(int id) {
        return (Theme) themeRepository.findById((long)id).orElseThrow(() -> new IllegalArgumentException("Invalid theme Id:" + id));
    }

    @Override
    public void delete(Theme theme){
        for (Jeu jeu:theme.getJeux()) {
            jeu.setTheme(null);
            jeuService.save(jeu);
        }
        themeRepository.delete(theme);
    }
}

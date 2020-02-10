package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.repository.ThemeRepository;

import java.util.List;

@Service
public class ThemeService implements IThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public List<Theme> findall() {
        return (List<Theme>) themeRepository.findAll();
    }
}

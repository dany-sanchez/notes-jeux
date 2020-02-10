package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.TypeJeu;
import univ.lorraine.notes.repository.TypeJeuRepository;

import java.util.List;

@Service
public class TypeJeuService implements ITypeJeuService {

    @Autowired
    private TypeJeuRepository typeJeuRepository;

    @Override
    public List<TypeJeu> findAll() {
        return (List<TypeJeu>) typeJeuRepository.findAll();
    }
}

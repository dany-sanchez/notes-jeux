package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.*;
import univ.lorraine.notes.repository.TypeRepository;

import java.util.List;

@Service
public class TypeService implements ITypeService {

    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    private JeuService jeuService;

    @Override
    public List<Type> findAll() {
        return (List<Type>) typeRepository.findAll();
    }

    @Override
    public Type save(Type type) { return (Type) typeRepository.save(type);}

    @Override
    public Type findById(int id) {
        return (Type) typeRepository.findById((long)id).orElseThrow(() -> new IllegalArgumentException("Invalid type Id:" + id));
    }

    @Override
    public void delete(Type type){
        for (Jeu jeu:type.getJeux()) {
            jeu.setType(null);
            jeuService.save(jeu);
        }
        typeRepository.delete(type);
    }
}

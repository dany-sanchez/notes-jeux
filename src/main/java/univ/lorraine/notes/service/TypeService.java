package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.model.Type;
import univ.lorraine.notes.repository.TypeRepository;

import java.util.List;

@Service
public class TypeService implements ITypeService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<Type> findAll() {
        return (List<Type>) typeRepository.findAll();
    }

    @Override
    public Type save(Type type) { return (Type) typeRepository.save(type);}
}

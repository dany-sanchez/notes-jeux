package univ.lorraine.notes.service;

import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.model.Type;

import java.util.List;

public interface ITypeService {

    List<Type> findAll();

    Type save(Type type);
}

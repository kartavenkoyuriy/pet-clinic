package edu.sfg.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findByid(ID id);

    T save (T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}

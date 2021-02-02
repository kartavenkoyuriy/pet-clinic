package edu.sfg.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    //why protected?
    //should be a separate map for each collection - how to implement it
    //
    protected Map<ID, T> map = new HashMap<>();

    T findByid(ID id){
        return map.get(id);
    }

    T save (ID id, T object){
        map.put(id, object);
        //put returns previous value
        return object;
    }

    Set<T> findAll(){
        //need to iterate and put objects to Set
        return new HashSet<>(map.values());
    }

    void delete(T object){
        //no other way to remove, since no way to get the ID
        map.values().removeIf(x -> x.equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }
}

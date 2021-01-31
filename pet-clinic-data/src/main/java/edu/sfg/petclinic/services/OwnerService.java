package edu.sfg.petclinic.services;

import edu.sfg.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}

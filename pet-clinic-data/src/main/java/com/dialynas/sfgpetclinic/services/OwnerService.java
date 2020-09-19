package com.dialynas.sfgpetclinic.services;

import com.dialynas.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}

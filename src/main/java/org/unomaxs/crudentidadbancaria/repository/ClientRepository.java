package org.unomaxs.crudentidadbancaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.unomaxs.crudentidadbancaria.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}

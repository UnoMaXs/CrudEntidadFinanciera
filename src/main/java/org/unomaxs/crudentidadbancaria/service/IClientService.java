package org.unomaxs.crudentidadbancaria.service;

import org.unomaxs.crudentidadbancaria.model.Client;


public interface IClientService {
    void createClient(Client client);
    Client getClient(Long id);
    void updateClient(Long id, Client client);
    void deleteClient(Long id);
}

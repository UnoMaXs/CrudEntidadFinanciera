package org.unomaxs.crudentidadbancaria.service.impl;

import org.springframework.stereotype.Service;
import org.unomaxs.crudentidadbancaria.model.Client;
import org.unomaxs.crudentidadbancaria.repository.ClientRepository;
import org.unomaxs.crudentidadbancaria.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void createClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void updateClient(Long id, Client client) {
        if (clientRepository.findById(id).isPresent()) {
            clientRepository.save(client);
        }
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}

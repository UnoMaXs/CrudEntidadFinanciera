package org.unomaxs.crudentidadbancaria.service.impl;

import org.springframework.stereotype.Service;
import org.unomaxs.crudentidadbancaria.model.Client;
import org.unomaxs.crudentidadbancaria.repository.ClientRepository;
import org.unomaxs.crudentidadbancaria.service.IClientService;

import java.time.LocalDateTime;

import static org.unomaxs.crudentidadbancaria.validations.AgeValidation.validateAge;
import static org.unomaxs.crudentidadbancaria.validations.ProductExistence.validateProduct;

@Service
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void createClient(Client client) {
        validateAge(client);
        client.setCreationDate(LocalDateTime.now());
        client.setLastModified(LocalDateTime.now());
        clientRepository.save(client);
    }

    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void updateClient(Long id, Client client) {
        if (clientRepository.findById(id).isPresent()) {
            client.setLastModified(LocalDateTime.now());
            clientRepository.save(client);
        }
    }

    @Override
    public void deleteClient(Long id) {
        validateProduct(getClient(id));
        clientRepository.deleteById(id);
    }


}

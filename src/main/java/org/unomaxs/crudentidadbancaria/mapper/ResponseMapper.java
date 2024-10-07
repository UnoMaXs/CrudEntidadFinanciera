package org.unomaxs.crudentidadbancaria.mapper;

import org.unomaxs.crudentidadbancaria.dto.response.ClientResponse;
import org.unomaxs.crudentidadbancaria.model.Client;

public class ResponseMapper {

    public Client toModel (ClientResponse clientResponse){
        Client client = new Client();
        client.setIdType(clientResponse.getIdType());
        client.setIdNumber(clientResponse.getIdNumber());
        client.setName(clientResponse.getName());
        client.setSurname(clientResponse.getSurname());
        client.setEmail(clientResponse.getEmail());
        client.setDateOfBirth(clientResponse.getDateOfBirth());
        client.setCreationDate(clientResponse.getCreationDate());
        client.setLastModified(clientResponse.getLastModified());
        return client;
    }

    public ClientResponse toResponse (Client client){
        ClientResponse clientResponse = new ClientResponse();
        clientResponse.setIdType(client.getIdType());
        clientResponse.setIdNumber(client.getIdNumber());
        clientResponse.setName(client.getName());
        clientResponse.setSurname(client.getSurname());
        clientResponse.setEmail(client.getEmail());
        clientResponse.setDateOfBirth(client.getDateOfBirth());
        clientResponse.setCreationDate(client.getCreationDate());
        clientResponse.setLastModified(client.getLastModified());
        return clientResponse;
    };

}

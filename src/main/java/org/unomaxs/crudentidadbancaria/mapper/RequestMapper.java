package org.unomaxs.crudentidadbancaria.mapper;

import org.unomaxs.crudentidadbancaria.dto.request.ClientRequest;
import org.unomaxs.crudentidadbancaria.model.Client;

public class RequestMapper {

    public Client toModel (ClientRequest clientRequest){
        Client client = new Client();
        client.setIdType(clientRequest.getIdType());
        client.setIdNumber(clientRequest.getIdNumber());
        client.setName(clientRequest.getName());
        client.setSurname(clientRequest.getSurname());
        client.setEmail(clientRequest.getEmail());
        client.setDateOfBirth(clientRequest.getDateOfBirth());
        client.setCreationDate(clientRequest.getCreationDate());
        client.setLastModified(clientRequest.getLastModified());
        client.setProduct(clientRequest.getProduct());
        return client;
    }

    public ClientRequest toRequest (Client client){
        ClientRequest clientRequest = new ClientRequest();
        clientRequest.setIdType(client.getIdType());
        clientRequest.setIdNumber(client.getIdNumber());
        clientRequest.setName(client.getName());
        clientRequest.setSurname(client.getSurname());
        clientRequest.setEmail(client.getEmail());
        clientRequest.setDateOfBirth(client.getDateOfBirth());
        clientRequest.setCreationDate(client.getCreationDate());
        clientRequest.setLastModified(client.getLastModified());
        clientRequest.setProduct(client.getProduct());
        return clientRequest;
    };

}

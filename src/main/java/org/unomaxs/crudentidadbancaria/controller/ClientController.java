package org.unomaxs.crudentidadbancaria.controller;

import org.springframework.web.bind.annotation.*;
import org.unomaxs.crudentidadbancaria.dto.request.ClientRequest;
import org.unomaxs.crudentidadbancaria.dto.response.ClientResponse;
import org.unomaxs.crudentidadbancaria.mapper.RequestMapper;
import org.unomaxs.crudentidadbancaria.mapper.ResponseMapper;
import org.unomaxs.crudentidadbancaria.service.IClientService;

@RestController
@RequestMapping("/api/v1/")
public class ClientController {

    private final IClientService clientService;
    private ResponseMapper responseMapper;
    private RequestMapper requestMapper;

    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/saveClient")
    public void saveClient(ClientRequest clientRequest){
        clientService.createClient(requestMapper.toModel(clientRequest));
    }

    @GetMapping("/getClient/{id}")
    public ClientResponse getClient(@PathVariable Long id) {
        return responseMapper.toResponse(clientService.getClient(id));
    }

    @PutMapping("/updateClient/{id}")
    public void updateClient(@PathVariable("id")Long id, ClientRequest clientRequest){
        clientService.updateClient(id, requestMapper.toModel(clientRequest));
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable("id")Long id) {
        clientService.deleteClient(id);
    }
}

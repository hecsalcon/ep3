package com.ep3.CRUD.Clientes;


import com.ep3.CRUD.Clientes.Entidades.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {


    private final ClienteRepository clienteRepository;
    @Autowired
    private Controller (ClienteRepository clienteRepository){
        this.clienteRepository=clienteRepository;
    }

    @GetMapping("/clientes")
    public List<Clientes> getAll(){
        return clienteRepository.findAll();
    }


}

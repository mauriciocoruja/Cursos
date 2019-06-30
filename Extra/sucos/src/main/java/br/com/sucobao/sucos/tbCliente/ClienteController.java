package br.com.sucobao.sucos.tbCliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/clientes"})
public class ClienteController {

    private ClienteRepository clienteRepository;


    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // C do CRUD
    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    // R do CRUD
    @GetMapping
    public List findAll(){
       return clienteRepository.findAll();
    }

    //



}

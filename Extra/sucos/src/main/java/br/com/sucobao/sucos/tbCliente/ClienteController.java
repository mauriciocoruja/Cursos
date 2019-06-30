package br.com.sucobao.sucos.tbCliente;

import br.com.sucobao.sucos.tbCliente.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
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

    // U do CRUD

    @PutMapping(value = "/{cpf}")
    public Cliente update(@PathVariable String cpf, @RequestBody Cliente cliente)
                throws ResourceNotFoundException {
            return clienteRepository.findById(cpf).map(clienteAtualizado -> {
                clienteAtualizado.setNome(cliente.getNome());
                clienteAtualizado.setEndereco1(cliente.getEndereco1());
                return clienteRepository.save(clienteAtualizado);
            }).orElseThrow(() ->
                    new ResourceNotFoundException("Não existe cliente cadastrado com o cpf: "+cpf));
        }

    //D do CRUD

    @DeleteMapping(value = "/{cpf}")
    public void delete(@PathVariable String cpf){
        clienteRepository.deleteById(cpf);
    }

}

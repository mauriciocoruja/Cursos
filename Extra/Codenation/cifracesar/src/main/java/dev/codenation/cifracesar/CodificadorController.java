package dev.codenation.cifracesar;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/resposta"})
public class CodificadorController {

    private CodificadorRepository repository;

    public CodificadorController(CodificadorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List findAll(){
        return repository.findAll();
    }

    @PostMapping
    public Codificador create(@RequestBody Codificador codificador){
        return repository.save(codificador);
    }

   /* @DeleteMapping
    public void delete(){
        delete();
    }*/
}

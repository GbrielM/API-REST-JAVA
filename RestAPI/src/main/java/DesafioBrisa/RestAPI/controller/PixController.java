package DesafioBrisa.RestAPI.controller;

import DesafioBrisa.RestAPI.model.PixModel;
import DesafioBrisa.RestAPI.model.UsuarioModel;
import DesafioBrisa.RestAPI.repository.PixRepository;
import DesafioBrisa.RestAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PixController {

    @Autowired
    private PixRepository repository;

    @GetMapping(path = "/api/pix/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/pix/salvar")
    public PixModel salvar(@RequestBody PixModel pix) {
        return repository.save(pix);
    }

    @DeleteMapping(path = "/api/pix/delete/{id}")
    public void deletePix(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

}

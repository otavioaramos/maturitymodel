package br.com.maturitymodel.maturitymodel.controller;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import br.com.maturitymodel.maturitymodel.service.AplicacoesService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aplicacoes")
public class AplicacoesController {

    @Autowired
    private AplicacoesService aplicacoesService;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Aplicacoes>> findAll () {
        return ResponseEntity.ok().body(aplicacoesService.findAll());
    };

    @GetMapping("/listarPorId/{id}")
    public ResponseEntity<Aplicacoes> findById (@PathVariable String id) {
        System.out.println(id);
        return ResponseEntity.ok().body(aplicacoesService.findById(id));
    };

    @PutMapping("/atualizarAplicacao/{id}")
    public ResponseEntity <Integer> update(@PathVariable String id, @RequestBody Aplicacoes aplicacoes){
         aplicacoesService.update(id, aplicacoes);
         return ResponseEntity.status(200).build();
    }

    @PostMapping("/incluirAplicacao")
    public ResponseEntity <Integer> insert(@RequestBody Aplicacoes aplicacoes){
        aplicacoesService.insert(aplicacoes);
        return ResponseEntity.status(200).build();
    }

    @DeleteMapping("/deletarAplicacao/{id}")
    public ResponseEntity <Integer> delete(@PathVariable String id){
         aplicacoesService.delete(id);
        return ResponseEntity.status(200).build();
    }

}

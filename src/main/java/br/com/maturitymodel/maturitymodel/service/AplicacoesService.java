package br.com.maturitymodel.maturitymodel.service;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import br.com.maturitymodel.maturitymodel.repository.AplicacoesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AplicacoesService {

    @Autowired
    private AplicacoesRepository repository;

    public List <Aplicacoes> findAll() {
        return repository.findAll();
    }

    public Aplicacoes findById (String _id) {
        return repository.findById(_id).orElseThrow(() -> new RuntimeException("Não foi possível encontrar o id"));
    }

    public boolean update (String _id, Aplicacoes aplicacoes){

        try {
            findById(_id);

            repository.save(aplicacoes);

            return true;

        } catch(Exception e) {
            return false;
        }
    }

    public boolean insert (Aplicacoes aplicacoes){

        try {
            repository.save(aplicacoes);

            return true;

        } catch(Exception e) {
            return false;
        }
    }

    public boolean delete (String _id){

        try {

            findById(_id);

            repository.deleteById(_id);

            return true;

        } catch(Exception e) {
            return false;
        }
    }
}
package br.com.maturitymodel.maturitymodel.service;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import br.com.maturitymodel.maturitymodel.repository.AplicacoesRepository;
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
}

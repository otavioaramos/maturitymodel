package br.com.maturitymodel.maturitymodel.service;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import br.com.maturitymodel.maturitymodel.repository.AplicacoesRepository;
import br.com.maturitymodel.maturitymodel.service.enums.Linguagens;
import br.com.maturitymodel.maturitymodel.service.exceptions.ObjetoNaoEncontratoException;
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
        return repository.findById(_id).orElseThrow(() -> new ObjetoNaoEncontratoException(_id));
    }

    public void update (String _id, Aplicacoes aplicacoes){

         findById(_id);

         Linguagens linguagens = Linguagens.getLinguagem(aplicacoes.getLinguagem());
         if (linguagens == null) throw new RuntimeException("Linguagem não permitida");

         repository.save(aplicacoes);
    }

    public void insert (Aplicacoes aplicacoes){

         Linguagens linguagens = Linguagens.getLinguagem(aplicacoes.getLinguagem());
         if (linguagens == null) throw new RuntimeException("Linguagem não permitida");

         repository.save(aplicacoes);

    }

    public void delete (String _id){

        findById(_id);

        repository.deleteById(_id);

    }
}
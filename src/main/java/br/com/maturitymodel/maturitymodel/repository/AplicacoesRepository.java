package br.com.maturitymodel.maturitymodel.repository;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AplicacoesRepository extends MongoRepository<Aplicacoes, String>  {

}

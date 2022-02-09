package com.dio.desafiodesignpatterns.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//repository é responsável por persistir os dados e realizar todas as operações relacionadas com o banco

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {  
    
}

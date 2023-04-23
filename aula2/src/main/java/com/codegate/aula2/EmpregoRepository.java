package com.codegate.aula2;

import org.springframework.data.repository.CrudRepository;

public interface EmpregoRepository extends CrudRepository<Emprego,Long> { // é o que chama diretamente a base de dados e é o comunicador direto entre a aplicação e a base de dados

}

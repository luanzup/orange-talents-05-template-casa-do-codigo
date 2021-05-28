package br.com.zup.luanalves.casadocodigo.cadastrarAutor.repository;

import br.com.zup.luanalves.casadocodigo.cadastrarAutor.entity.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long> {

}

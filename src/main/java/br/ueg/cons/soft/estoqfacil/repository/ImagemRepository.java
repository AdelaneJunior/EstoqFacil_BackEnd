package br.ueg.cons.soft.estoqfacil.repository;

import br.ueg.cons.soft.estoqfacil.model.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem,Long> {
}

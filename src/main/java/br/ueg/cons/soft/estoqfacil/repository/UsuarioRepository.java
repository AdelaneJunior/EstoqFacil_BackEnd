package br.ueg.cons.soft.estoqfacil.repository;


import br.ueg.cons.soft.estoqfacil.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    @Query("select u  from Usuario  u " +
            "inner join fetch u.funcionario f " +
            "inner join fetch f.cargo c " +
            "inner join fetch c.permissoes " +
            "where u.funcionario.pessoa.email = :usuarioEmail")
    Optional<Usuario> findUsuarioByFuncionario_Pessoa_Email(String usuarioEmail);

    @Query("select u from Usuario u " +
            "inner join fetch u.funcionario f " +
            "inner join fetch f.cargo c " +
            "inner join fetch c.permissoes ")
    List<Usuario> findAll();
}

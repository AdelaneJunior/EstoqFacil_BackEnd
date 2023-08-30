package br.ueg.cons.soft.estoqfacil.model;

import br.ueg.prog.webi.api.model.IEntidade;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Getter
@Setter
@Table(name = Cliente.NOME_TABELA)
public @Data class Cliente implements IEntidade<Long> {

    public static final String NOME_TABELA = "cliente";

    public static final class Coluna{

        public static final String ID = "clnt_codigo";

        public static final String ID_PESSOA = "clnt_pessoa";

    }

    public static final class Atributo{

    }

    @SequenceGenerator(
            name = "a_gerador_sequence",
            sequenceName = "cliente_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "a_gerador_sequence"

    )

    @Id
    @Column(name = Coluna.ID)
    private Long codigo;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = Coluna.ID_PESSOA, unique = true, nullable = false)
    private Pessoa codigoPessoa;

    @Override
    public String getTabelaNome() {
        return NOME_TABELA;
    }

    @Override
    public Long getId() {
        return getCodigo();
    }

    @Override
    public void setId(Long id) {
        setCodigo(id);
    }
}
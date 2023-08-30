package br.ueg.cons.soft.estoqfacil.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private Long codigo;

    private Long categoriaID;

    private Long usuarioID;

    private String nome;

    private String descricao;

    private Long quantidade;

    private Double preco;

}
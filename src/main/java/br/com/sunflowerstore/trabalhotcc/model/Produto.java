package br.com.sunflowerstore.trabalhotcc.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by VictorJr on 23/03/2017.
 */
public class Produto  {

    @NotBlank(message = "Código é obrigatório")
    private String codigo;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "O tamanho da descrição deve estar entre 1 e 50")
    @Size(min = 1,max = 50)
    private String descricao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

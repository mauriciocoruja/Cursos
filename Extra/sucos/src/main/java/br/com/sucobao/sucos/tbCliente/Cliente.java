package br.com.sucobao.sucos.tbCliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.security.Identity;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbCliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cpf;

    @NotNull
    private String nome;
    private String endereco1;
    private String endereco2;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_NASCIMENTO")
    //TODO Verificar se a Classe dada abaixo não vai dar ruim, caso ocorra, tentar mudar para a import java.sql.Date;
    private Date dataNascimento;
    private short idade;
    @Column (name = "LIMITE_CREDITO")
    private float limiteCredito;

    @Column (name = "LIMITE_COMPRA")
    private float limiteCompra;

    @Column (name = "PRIMEIRA_COMPRA")
    private byte primeiraCompra;

}

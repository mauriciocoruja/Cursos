package br.com.sucobao.sucos.tbCliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
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
    private Date datanascimento;
    private short idade;
    private float limitecredito;
    private float volumecompra;
    private byte primeiracompra;

}

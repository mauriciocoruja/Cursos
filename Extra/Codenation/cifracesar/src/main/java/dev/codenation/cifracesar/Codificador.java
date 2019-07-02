package dev.codenation.cifracesar;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@Data
@Entity
public class Codificador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero_casas;
    private String token;
    private String cifrado;
    private String decifrado;
    private String resumo_criptografico;


    public void decodificar(int numero_casas, String cifrado){

        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = cifrado.length();

        for (int i = 0; i < tamanhoTexto; i++) {

            int letraDecodificadaASCII = ((int) cifrado.charAt(i));

            if(letraDecodificadaASCII == 97 || letraDecodificadaASCII == 98) letraDecodificadaASCII += 24;
            else letraDecodificadaASCII -= numero_casas;

            while (letraDecodificadaASCII < 32){
                letraDecodificadaASCII += 94;
            }

            if (letraDecodificadaASCII < 65){
                letraDecodificadaASCII += numero_casas;
            } if(letraDecodificadaASCII == 124){
                letraDecodificadaASCII = 32;
            }
            texto.append((char)letraDecodificadaASCII);
        }
        setDecifrado(texto.toString());
    }

    public void geraHash(){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(decifrado.getBytes(StandardCharsets.UTF_8));
            resumo_criptografico = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}

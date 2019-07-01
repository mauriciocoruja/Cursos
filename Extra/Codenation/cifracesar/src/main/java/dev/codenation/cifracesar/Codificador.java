package dev.codenation.cifracesar;

import lombok.Data;

import javax.persistence.Entity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Data
@Entity
public class Codificador {

    private int numero_casas = 2;
    private String token = "86dd056f414767474db2bcb3c94d83191c65a71e";
    private String cifrado = "cp qticpkbcvkqp vjcv vtgcvu kvu rtqitcoogtu cu oqtqpu yknn uqqp jcxg rtqitcoogtu vjcv ctg yknnkpi cpf cdng vq cev nkmg oqtqpu qpna. dlctpg uvtqwuvtwr";
    private String decifrado;
    private String resumo_criptografico;

    {
        try {
            resumo_criptografico = sha1(decifrado);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args
     * @throws NoSuchAlgorithmException
     */
    public static void geraHash(String[] args) throws NoSuchAlgorithmException {
        Codificador codificador = new Codificador();
        System.out.println(sha1(codificador.getDecifrado()));
    }

    static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    public String decodificar(int numero_casas, String cifrado){

        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = cifrado.length();

        for (int i = 0; i < tamanhoTexto; i++) {

            int letraDecodificadaASCII = ((int) cifrado.charAt(i));

            if(letraDecodificadaASCII == 97 || letraDecodificadaASCII == 98) letraDecodificadaASCII += 24;
            else {
                letraDecodificadaASCII -= numero_casas;
            }

            while (letraDecodificadaASCII <= 32){
                letraDecodificadaASCII += 94;
            }


            if (letraDecodificadaASCII < 65){
                letraDecodificadaASCII += numero_casas;
            } if(letraDecodificadaASCII == 124){
                letraDecodificadaASCII = 32;
            }
            texto.append((char)letraDecodificadaASCII);
        }
        return texto.toString();
    }

}

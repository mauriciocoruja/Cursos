package dev.codenation.cifracesar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.NoSuchAlgorithmException;


@SpringBootApplication
public class CifraCesarApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		SpringApplication.run(CifraCesarApplication.class, args);

		Codificador resposta = new Codificador();

		resposta.setNumero_casas(2);
		resposta.setToken("86dd056f414767474db2bcb3c94d83191c65a71e");
		resposta.setCifrado("cp qticpkbcvkqp vjcv vtgcvu kvu rtqitcoogtu cu oqtqpu yknn uqqp jcxg rtqitcoogtu vjcv ctg yknnkpi cpf cdng vq cev nkmg oqtqpu qpna. dlctpg uvtqwuvtwr");
		String s = resposta.getCifrado().toLowerCase();
		resposta.setCifrado(s);
		resposta.decodificar(resposta.getNumero_casas(),s);
		String decifrado = resposta.getDecifrado();

		resposta.geraHash();

		System.out.println(s);
		System.out.println(decifrado);
		System.out.println(resposta.getResumo_criptografico());
		System.out.println(resposta);

	}

}

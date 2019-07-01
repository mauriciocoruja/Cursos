package dev.codenation.cifracesar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class CifraCesarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CifraCesarApplication.class, args);

		Codificador codificador = new Codificador();

        System.out.println(codificador.getDecifrado());
        System.out.println(codificador.getToken());



	}

}

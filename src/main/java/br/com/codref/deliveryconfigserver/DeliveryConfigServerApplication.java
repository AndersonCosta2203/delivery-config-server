package br.com.codref.deliveryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 * Para que nosso projeto seja reconhecido como um Aplicativo Spring Boot precisamos adicionar também a anotação
 */
@SpringBootApplication
/*
 * Nós queremos que essa aplicação seja um Servidor de Configuração, e nada mais fácil que informar isso utilizando uma anotação.
 */
@EnableConfigServer
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryConfigServerApplication.class, args);
	}
}

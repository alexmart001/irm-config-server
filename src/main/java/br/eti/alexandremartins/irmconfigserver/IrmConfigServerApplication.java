package br.eti.alexandremartins.irmconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class IrmConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrmConfigServerApplication.class, args);
	}

}

package br.com.alura.ScreemMatch;

import br.com.alura.ScreemMatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreemMatchApplication  implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreemMatchApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
        Principal principal = new Principal();
		principal.exibeMenu();

	}
}

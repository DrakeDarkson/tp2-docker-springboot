package al.infnet.edu.br.tp2_docker_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Tp2DockerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp2DockerSpringbootApplication.class, args);
	}

	@RestController
	class HelloController {
		@GetMapping("/hello")
		public String hello() {
			return "Hello, Docker!";
		}
	}
}

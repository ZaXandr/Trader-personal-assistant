package com.zakharov.cryptomanager;

import com.zakharov.cryptomanager.entities.Position;
import com.zakharov.cryptomanager.repository.PositionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CryptoManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (PositionRepository repository){
		return args->{

			Position position = new Position(1000,950,1200,10000,1000,1);
			repository.insert(position);
		};
	}
}

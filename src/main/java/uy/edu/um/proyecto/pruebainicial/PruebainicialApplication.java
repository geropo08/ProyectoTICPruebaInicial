package uy.edu.um.proyecto.pruebainicial;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javafx.application.Application;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.spring.SpringFxWeaver;
import uy.edu.um.proyecto.pruebainicial.ventanas.Hola;

@SpringBootApplication

public class PruebainicialApplication {
	public static void main(String[] args) {
		//SpringApplication.run(PruebainicialApplication.class, args);
		Application.launch(Hola.class, args);
	}
	

}

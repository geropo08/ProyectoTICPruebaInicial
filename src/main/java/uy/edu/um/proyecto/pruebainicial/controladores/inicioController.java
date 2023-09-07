package uy.edu.um.proyecto.pruebainicial.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;

import uy.edu.um.proyecto.pruebainicial.servicios.PersonaServicio;

@Component
@FxmlView("hello-view.fxml")
public class inicioController {
    
    @Autowired
	private PersonaServicio personaServicio;


    @FXML
    private Label lbl_nombre;

    @FXML
    private TextField input_nombre;

    @FXML
    private Label welcomeText;

    @FXML
    private Button button_OK;

    @FXML
    private TextField input_apellido;

    @FXML
    private Label lbl_apellido;


    @FXML
    void onOKButtonClick(ActionEvent event) {
        System.out.println("Nombre: " + input_nombre.getText());
        System.out.println("Apellido: " + input_apellido.getText());

        //personaServicio.createPerson("Geronimo", "Garcia");
		personaServicio.createPerson(input_nombre.getText(), input_apellido.getText());

    }

}

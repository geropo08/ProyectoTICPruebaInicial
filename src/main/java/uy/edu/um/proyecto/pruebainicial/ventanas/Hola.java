package uy.edu.um.proyecto.pruebainicial.ventanas;




import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import javafx.application.Application;
import javafx.application.Platform;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import uy.edu.um.proyecto.pruebainicial.PruebainicialApplication;
import uy.edu.um.proyecto.pruebainicial.controladores.inicioController;

public class Hola extends Application {

	private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        String[] args = getParameters().getRaw().toArray(new String[0]);

        this.applicationContext = new SpringApplicationBuilder()
            .sources(PruebainicialApplication.class)
            .run(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
		FxWeaver fxWeaver = applicationContext.getBean(FxWeaver.class);
		Parent root = fxWeaver.loadView(inicioController.class);
    	Scene scene = new Scene(root);
    	primaryStage.setScene(scene);
    	primaryStage.show();
		//FXMLLoader fxmlLoader = new FXMLLoader(Hola.class.getResource("hello-view.fxml"));
		//Parent root = fxmlLoader.load();
    
    // You can now manipulate the loaded UI components if needed
    	//Scene scene = new Scene(root);
    	//primaryStage.setScene(scene);
    	//primaryStage.show();

	}
	@Override
	public void stop() {
    	this.applicationContext.close();
    	Platform.exit();
	}
	
    
}

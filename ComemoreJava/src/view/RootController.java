package view;

import java.io.IOException;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class RootController {
	
	@FXML
	private void abrirClienteEdit() {
		try {
			ClienteController controller = new ClienteController();
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/ClienteEdit.fxml"));
			GridPane clienteEdit = new GridPane();
			loader.setController(controller);
			clienteEdit = loader.load();
			
			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(Main.class.getResource("../view/Endereco.fxml"));
			GridPane endereco = new GridPane();
			loader2.setController(controller);
			endereco = loader2.load();
			
			HBox hBox = new HBox();
			hBox.getChildren().addAll(clienteEdit, endereco);
			hBox.setAlignment(Pos.CENTER);
			Main.getRoot().setCenter(hBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void abrirConfiguracao() {
		FXMLLoader loader3 = new FXMLLoader();
		loader3.setLocation(Main.class.getResource("../view/Configuracao.fxml"));
		AnchorPane config = new AnchorPane();
		try {
			config = loader3.load();
			Main.getRoot().setCenter(config);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

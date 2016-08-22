package view;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class RootController {
	
	@FXML
	private void abrirClienteEdit() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/ClienteEdit.fxml"));
			BorderPane clienteEdit = new BorderPane();
			clienteEdit = loader.load();
			Main.getRoot().setCenter(clienteEdit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package view;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class RootController {
	
	@FXML
	private void abrirClienteEdit() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/ClienteEdit.fxml"));
			BorderPane clienteEdit = new BorderPane();
			clienteEdit = loader.load();
			
			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(Main.class.getResource("../view/Endereco.fxml"));
			BorderPane endereco = new BorderPane();
			endereco = loader2.load();
			
			HBox hBox = new HBox();
			hBox.getChildren().addAll(clienteEdit, endereco);
			hBox.setAlignment(Pos.CENTER);
			Main.getRoot().setCenter(hBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

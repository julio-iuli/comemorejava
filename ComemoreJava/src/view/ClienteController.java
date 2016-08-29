package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ClienteController {
	
	@FXML
	private TextField clienteField;
	@FXML
	private TextField emissorField;
	@FXML
	private TextField emailField;
	@FXML
	private TextField recomendacaoField;
	@FXML
	private TextField complementoField;
	
	@FXML
	private void handleSalvar() {
	
		System.out.println(clienteField.getText());
		System.out.println(complementoField.getText());
		
	}

}

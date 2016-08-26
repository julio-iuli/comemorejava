package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EnderecoController {
	
	@FXML
	private TextField ufField;
	@FXML
	private TextField cidadeField;
	@FXML
	private TextField bairroField;
	@FXML
	private TextField logradouroField;
	@FXML
	private TextField cepField;
	
	//private Endereco endereco;
	
	@FXML
	private void initialize(){
	}
	
	@FXML
	private void showFieldData(){
		
		System.out.println(ufField.getText());
		System.out.println(cidadeField.getText());
		System.out.println(bairroField.getText());
		System.out.println(logradouroField.getText());
		System.out.println(cepField.getText());
		
	}

}

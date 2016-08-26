package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Endereco {

	private StringProperty ds_uf;
	private StringProperty ds_cidade;
	private StringProperty ds_bairro;
	private StringProperty ds_logradouro;
	private StringProperty ds_cep;
	
	public Endereco(String ds_uf, String ds_cidade, String ds_bairro, String de_logradouro, String ds_cep) {
		this.ds_uf = new SimpleStringProperty(this, "ds_uf", ds_uf);
		this.ds_cidade = new SimpleStringProperty(this, "ds_cidade", ds_cidade);
		this.ds_bairro = new SimpleStringProperty(this, "ds_bairro", ds_bairro);
		this.ds_logradouro = new SimpleStringProperty(this, "ds_logradouro");
		this.ds_cep = new SimpleStringProperty(this, "ds_cep", ds_cep);		
	}
	
	public StringProperty getDs_uf() {
		return ds_uf;
	}
	public void setDs_uf(StringProperty ds_uf) {
		this.ds_uf = ds_uf;
	}
	public StringProperty getDs_cidade() {
		return ds_cidade;
	}
	public void setDs_cidade(StringProperty ds_cidade) {
		this.ds_cidade = ds_cidade;
	}
	public StringProperty getDs_bairro() {
		return ds_bairro;
	}
	public void setDs_bairro(StringProperty ds_bairro) {
		this.ds_bairro = ds_bairro;
	}
	public StringProperty getDs_logradouro() {
		return ds_logradouro;
	}
	public void setDs_logradouro(StringProperty ds_logradouro) {
		this.ds_logradouro = ds_logradouro;
	}
	public StringProperty getDs_cep() {
		return ds_cep;
	}
	public void setDs_cep(StringProperty ds_cep) {
		this.ds_cep = ds_cep;
	}
	
	
	
}

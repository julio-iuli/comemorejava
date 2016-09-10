package modelfxbeans;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class Cliente {
	
	private StringProperty ds_cliente;
	private IntegerProperty ds_ddd_res;
	private IntegerProperty ds_tel_res;
	private IntegerProperty ds_ddd_cel;
	private IntegerProperty ds_tel_cel;
	private IntegerProperty ds_rg;
	private StringProperty ds_emissor_rg;
	private IntegerProperty ds_cpf;
	private IntegerProperty ds_cnpj;
	private IntegerProperty ds_pf_pj;
	private StringProperty ds_email;
	private ObjectProperty<LocalDate> ds_data_nasc;
	private IntegerProperty ds_tb_logradouro_id_logradouro;
	private StringProperty ds_endereco_complemento;
	private StringProperty ds_recomendacao_nome;
	private ObjectProperty<LocalDate> ds_recomendacao_data_nasc;
	public StringProperty getDs_cliente() {
		return ds_cliente;
	}
	public void setDs_cliente(StringProperty ds_cliente) {
		this.ds_cliente = ds_cliente;
	}
	public IntegerProperty getDs_ddd_res() {
		return ds_ddd_res;
	}
	public void setDs_ddd_res(IntegerProperty ds_ddd_res) {
		this.ds_ddd_res = ds_ddd_res;
	}
	public IntegerProperty getDs_tel_res() {
		return ds_tel_res;
	}
	public void setDs_tel_res(IntegerProperty ds_tel_res) {
		this.ds_tel_res = ds_tel_res;
	}
	public IntegerProperty getDs_ddd_cel() {
		return ds_ddd_cel;
	}
	public void setDs_ddd_cel(IntegerProperty ds_ddd_cel) {
		this.ds_ddd_cel = ds_ddd_cel;
	}
	public IntegerProperty getDs_tel_cel() {
		return ds_tel_cel;
	}
	public void setDs_tel_cel(IntegerProperty ds_tel_cel) {
		this.ds_tel_cel = ds_tel_cel;
	}
	public IntegerProperty getDs_rg() {
		return ds_rg;
	}
	public void setDs_rg(IntegerProperty ds_rg) {
		this.ds_rg = ds_rg;
	}
	public StringProperty getDs_emissor_rg() {
		return ds_emissor_rg;
	}
	public void setDs_emissor_rg(StringProperty ds_emissor_rg) {
		this.ds_emissor_rg = ds_emissor_rg;
	}
	public IntegerProperty getDs_cpf() {
		return ds_cpf;
	}
	public void setDs_cpf(IntegerProperty ds_cpf) {
		this.ds_cpf = ds_cpf;
	}
	public IntegerProperty getDs_cnpj() {
		return ds_cnpj;
	}
	public void setDs_cnpj(IntegerProperty ds_cnpj) {
		this.ds_cnpj = ds_cnpj;
	}
	public IntegerProperty getDs_pf_pj() {
		return ds_pf_pj;
	}
	public void setDs_pf_pj(IntegerProperty ds_pf_pj) {
		this.ds_pf_pj = ds_pf_pj;
	}
	public StringProperty getDs_email() {
		return ds_email;
	}
	public void setDs_email(StringProperty ds_email) {
		this.ds_email = ds_email;
	}
	public ObjectProperty<LocalDate> getDs_data_nasc() {
		return ds_data_nasc;
	}
	public void setDs_data_nasc(ObjectProperty<LocalDate> ds_data_nasc) {
		this.ds_data_nasc = ds_data_nasc;
	}
	public IntegerProperty getDs_tb_logradouro_id_logradouro() {
		return ds_tb_logradouro_id_logradouro;
	}
	public void setDs_tb_logradouro_id_logradouro(IntegerProperty ds_tb_logradouro_id_logradouro) {
		this.ds_tb_logradouro_id_logradouro = ds_tb_logradouro_id_logradouro;
	}
	public StringProperty getDs_endereco_complemento() {
		return ds_endereco_complemento;
	}
	public void setDs_endereco_complemento(StringProperty ds_endereco_complemento) {
		this.ds_endereco_complemento = ds_endereco_complemento;
	}
	public StringProperty getDs_recomendacao_nome() {
		return ds_recomendacao_nome;
	}
	public void setDs_recomendacao_nome(StringProperty ds_recomendacao_nome) {
		this.ds_recomendacao_nome = ds_recomendacao_nome;
	}
	public ObjectProperty<LocalDate> getDs_recomendacao_data_nasc() {
		return ds_recomendacao_data_nasc;
	}
	public void setDs_recomendacao_data_nasc(ObjectProperty<LocalDate> ds_recomendacao_data_nasc) {
		this.ds_recomendacao_data_nasc = ds_recomendacao_data_nasc;
	}
	
	

}

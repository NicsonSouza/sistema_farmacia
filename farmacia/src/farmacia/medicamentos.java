package farmacia;

import java.sql.Date;

public class medicamentos {
	
	//variaveis
	private String nome, lote, tipo;
	private Date data_validade;
	private int qnt;
	private float qnt_in;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_validade() {
		return data_validade;
	}
	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public float getQnt_in() {
		return qnt_in;
	}
	public void setQnt_in(float qnt_in) {
		this.qnt_in = qnt_in;
	}

}

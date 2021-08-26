package br.com.fiap.healthtrack.pesagem;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

public class Peso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	int codPesagem;
	Date dataPesagem;
	float peso;

	// Construtor vazio:

	public Peso() {

	}

	// M�todos getters and setters:

	public int getCodPesagem() {
		return codPesagem;
	}

	public void setCodPesagem(int codPesagem) {
		this.codPesagem = codPesagem;
	}

	public Date getDataPesagemDate() {
		return dataPesagem;
	}

	public void setDataPesagemDate(Date dataPesagemDate) {
		this.dataPesagem = dataPesagemDate;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	// M�todos:

	public boolean cadastrarPeso(Date dataPesagem, float peso) {
		boolean cadastroPesoFinalizado = false;

		return cadastroPesoFinalizado;

	}

	public ArrayList<Peso> consultarPeso(ArrayList<Peso> datasPesagem) {
		ArrayList<Peso> listaPesos = new ArrayList<>();

		return listaPesos;
	}

	public boolean editarPeso(int codPesagem) {
		boolean edicaoPesoFinalizada = false;

		return edicaoPesoFinalizada;
	}

	public boolean excluirPeso(int codPesagem) {
		boolean exclusaoPesoFinalizada = false;

		return exclusaoPesoFinalizada;
	}
}

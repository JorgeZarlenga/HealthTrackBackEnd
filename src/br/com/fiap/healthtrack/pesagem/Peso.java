package br.com.fiap.healthtrack.pesagem;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

/**
 * Classe que abstrai o atributo Peso
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */
public class Peso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	/**
	 * C�digo identificador do registro de peso
	 */
	int codPesagem;
	
	/**
	 * Data de pesagem
	 */
	Date dataPesagem;
	
	/**
	 * Peso (em quilos)
	 */
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

	/**
	 * Faz o cadastro de um peso
	 * @param Data da pesagem
	 * @param Peso (em quilos)
	 */
	public boolean cadastrarPeso(Date dataPesagem, float peso) {
		boolean cadastroPesoFinalizado = false;

		return cadastroPesoFinalizado;
	}
	
	/**
	 * Retorna uma listagem de medi��es de peso (para exibi��o do hist�rico e c�lculo da diferen�a na dashboard)
	 * @param Datas de pesagem
	 */
	public ArrayList<Peso> consultarPeso(ArrayList<Peso> datasPesagem) {
		ArrayList<Peso> listaPesos = new ArrayList<>();

		return listaPesos;
	}

	/**
	 * Edita os dados pessoais do usu�rio
	 * @param Data da pesagem
	 * @param Peso (em quilos)
	 */
	public boolean editarPeso(Date dataPesagem, float peso) {
		boolean edicaoPesoFinalizada = false;

		return edicaoPesoFinalizada;
	}

	/**
	 * Exclui o cadastro de peso
	 * @param C�digo identificador da medi��o de peso
	 */
	public boolean excluirPeso(int codPesagem) {
		boolean exclusaoPesoFinalizada = false;

		return exclusaoPesoFinalizada;
	}
}

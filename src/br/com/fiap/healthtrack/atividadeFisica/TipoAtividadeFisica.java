package br.com.fiap.healthtrack.atividadeFisica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que abstrai o tipo de Atividade Fisica
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */
public class TipoAtividadeFisica implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	int codTipoAtividadeFisica;
	String nomeTipoAtividadeFisica;

	// Construtor vazio:

	public TipoAtividadeFisica() {

	}

	// M�todos getters and setters:

	public int getCodTipoAtividadeFisica() {
		return codTipoAtividadeFisica;
	}

	public void setCodTipoAtividadeFisica(int codTipoAtividadeFisica) {
		this.codTipoAtividadeFisica = codTipoAtividadeFisica;
	}

	public String getNomeTipoAtividadeFisica() {
		return nomeTipoAtividadeFisica;
	}

	public void setNomeTipoAtividadeFisica(String nomeTipoAtividadeFisica) {
		this.nomeTipoAtividadeFisica = nomeTipoAtividadeFisica;
	}

	// M�todos:

	public boolean cadastrarTipoAtividadeFisica(String nomeTipoAtividadeFisica) {
		boolean cadastroTipoAtividadeFisicaFinalizado = false;

		return cadastroTipoAtividadeFisicaFinalizado;
	}

	public ArrayList<TipoAtividadeFisica> consultarTipoAtividadeFisica() {
		ArrayList<TipoAtividadeFisica> listaTiposAtividadeFisica = new ArrayList<>();

		return listaTiposAtividadeFisica;
	}

	public boolean editarTipoAtividadeFisica(int codTipoAtividadeFisica) {
		boolean edicaoTipoAtividadeFisicaFinalizada = false;

		return edicaoTipoAtividadeFisicaFinalizada;
	}

	public boolean excluirTipoAtividadeFisica(int codTipoAtividadeFisica) {
		boolean exclusaoTipoAtividadeFisicaFinalizada = false;

		return exclusaoTipoAtividadeFisicaFinalizada;
	}

}

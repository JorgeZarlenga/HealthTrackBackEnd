package br.com.fiap.healthtrack.alimentacao;

import java.io.Serializable;
import java.util.ArrayList;

public class TipoAlimento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	int codTipoAlimento;
	String nomeTipoAlimento;

	// Construtor vazio:
	// Teste de coment�rio

	public TipoAlimento() {

	}

	// M�todos getters and setters:

	public int getCodTipoAlimento() {
		return codTipoAlimento;
	}

	public void setCodTipoAlimento(int codTipoAlimento) {
		this.codTipoAlimento = codTipoAlimento;
	}

	public String getNomeTipoAlimento() {
		return nomeTipoAlimento;
	}

	public void setNomeTipoAlimento(String nomeTipoAlimento) {
		this.nomeTipoAlimento = nomeTipoAlimento;
	}

	// M�todos:

	public boolean cadastrarTipoAlimento(String nomeTipoAlimento) {
		boolean cadastroTipoAlimentoFinalizado = false;

		return cadastroTipoAlimentoFinalizado;
	}

	public ArrayList<TipoAlimento> consultarTipoAlimento() {
		ArrayList<TipoAlimento> listaTiposAlimento = new ArrayList<>();

		return listaTiposAlimento;
	}

	public boolean editarTipoAlimento(int codTipoAlimento) {
		boolean edicaoTipoAlimentoFinalizada = false;

		return edicaoTipoAlimentoFinalizada;
	}

	public boolean excluirTipoAlimento(int codAlimento) {
		boolean exclusaoTipoAlimentoFinalizada = false;

		return exclusaoTipoAlimentoFinalizada;
	}
}

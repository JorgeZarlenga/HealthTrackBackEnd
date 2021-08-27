package br.com.fiap.healthtrack.atividadeFisica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe que abstrai o registro de Atividade Física
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */
public class AtividadeFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	int codAtividadeFisica;
	float energiaKcalAtividadeFisica;
	Date dataHoraInicioAtividadeFisica;
	Date dataHoraTerminoAtividadeFisica;
	String descricaoAtividadeFisica;

	// Construtor vazio:

	public AtividadeFisica() {

	}

	// Mï¿½todos getters and setters:

	public int getCodAtividadeFisica() {
		return codAtividadeFisica;
	}

	public void setCodAtividadeFisica(int codAtividadeFisica) {
		this.codAtividadeFisica = codAtividadeFisica;
	}

	public float getEnergiaKcalAtividadeFisica() {
		return energiaKcalAtividadeFisica;
	}

	public void setEnergiaKcalAtividadeFisica(float energiaKcalAtividadeFisica) {
		this.energiaKcalAtividadeFisica = energiaKcalAtividadeFisica;
	}

	public Date getDataHoraInicioAtividadeFisica() {
		return dataHoraInicioAtividadeFisica;
	}

	public void setDataHoraInicioAtividadeFisica(Date dataHoraInicioAtividadeFisica) {
		this.dataHoraInicioAtividadeFisica = dataHoraInicioAtividadeFisica;
	}

	public Date getDataHoraTerminoAtividadeFisica() {
		return dataHoraTerminoAtividadeFisica;
	}

	public void setDataHoraTerminoAtividadeFisica(Date dataHoraTerminoAtividadeFisica) {
		this.dataHoraTerminoAtividadeFisica = dataHoraTerminoAtividadeFisica;
	}

	public String getDescricaoAtividadeFisica() {
		return descricaoAtividadeFisica;
	}

	public void setDescricaoAtividadeFisica(String descricaoAtividadeFisica) {
		this.descricaoAtividadeFisica = descricaoAtividadeFisica;
	}

	// Mï¿½todos:

	public boolean cadastrarAtividadeFisica(int codAtividadeFisica, Date dataHoraInicioAtividadeFisica,
			Date dataHoraTerminoAtividadeFisica, float energiaKcalAtividadeFisica, String descricaoAtividadeFisica) {
		boolean cadastroAtividadeFisicaFinalizado = false;

		return cadastroAtividadeFisicaFinalizado;
	}

	public ArrayList<AtividadeFisica> consultarAtividadeFisica(Date dataHoraAlimento) {
		ArrayList<AtividadeFisica> listaAtividadesFisicas = new ArrayList<>();

		return listaAtividadesFisicas;
	}

	public boolean editarAtividadeFisica(int codAtividadeFisica) {
		boolean edicaoAtividadeFisicaFinalizada = false;

		return edicaoAtividadeFisicaFinalizada;
	}

	public boolean excluirAtividadeFisica(int codAtividadeFisica) {
		boolean exclusaoAtividadeFisica = false;

		return exclusaoAtividadeFisica;
	}
}

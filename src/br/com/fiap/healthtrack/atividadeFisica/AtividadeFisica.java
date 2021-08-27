package br.com.fiap.healthtrack.atividadeFisica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe que abstrai o registro de Atividade Fisica
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */
public class AtividadeFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	/**
	 * Código identificador do registro de atividade fisica
	 */
	int codAtividadeFisica;
	
	/**
	 * Valor de energia (em kcal) de um registro de atividade fisica
	 */
	float energiaKcalAtividadeFisica;
	
	/**
	 * Data e hora de inicio de um registro de atividade fisica
	 */
	Date dataHoraInicioAtividadeFisica;
	
	/**
	 * Data e hora de término de um registro de atividade fisica
	 */
	Date dataHoraTerminoAtividadeFisica;
	
	/**
	 * Descrição (texto livre) de um registro de atividade fisica
	 */
	String descricaoAtividadeFisica;

	// Construtor vazio:

	public AtividadeFisica() {

	}

	// Metodos getters and setters:

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

	// Metodos:
	
	/**
	 * Faz o cadastro de um registro de atividade física
	 * @param Data e hora de início de um registro de atividade física
	 * @param Data e hora de término de um registro de atividade física
	 * @param Valor de energia (em kcal) de um registro de atividade física
	 * @param Descrição (texto livre) de um registro de atividade física
	 */
	public boolean cadastrarAtividadeFisica(Date dataHoraInicioAtividadeFisica,
			Date dataHoraTerminoAtividadeFisica, float energiaKcalAtividadeFisica, String descricaoAtividadeFisica) {
		boolean cadastroAtividadeFisicaFinalizado = false;

		return cadastroAtividadeFisicaFinalizado;
	}

	/**
	 * Retorna uma listagem de registros de atividades físicas
	 * @param Data para recuperação de registros de atividades físicas
	 */
	public ArrayList<AtividadeFisica> consultarAtividadeFisica(Date dataAtividadeFisica) {
		ArrayList<AtividadeFisica> listaAtividadesFisicas = new ArrayList<>();

		return listaAtividadesFisicas;
	}

	/**
	 * Edita os dados de um registro de atividade física
	 * @param Código identificador do registro de atividade fisica
	 * @param Valor de energia (em kcal) de um registro de atividade física
	 * @param Data e hora de início de um registro de atividade física
	 * @param Data e hora de termino de um registro de atividade física
	 * @param Descrição (texto livre) de um registro de atividade física
	 */
	public boolean editarAtividadeFisica(Date dataHoraInicioAtividadeFisica,
			Date dataHoraTerminoAtividadeFisica, float energiaKcalAtividadeFisica, String descricaoAtividadeFisica) {
		boolean edicaoAtividadeFisicaFinalizada = false;

		return edicaoAtividadeFisicaFinalizada;
	}

	/**
	 * Exclui o registro de atividade física
	 * @param Codigo identificador do registro de atividade física
	 */
	public boolean excluirAtividadeFisica(int codAtividadeFisica) {
		boolean exclusaoAtividadeFisica = false;

		return exclusaoAtividadeFisica;
	}
}

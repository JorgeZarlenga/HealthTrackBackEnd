package br.com.fiap.pressaoArterial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class PressaoArterial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	int codMedicao;
	Date dataMedicao;
	int pressaoSistolica;
	int pressaoDiastolica;

	// Construtor vazio:

	public PressaoArterial() {

	}

	// M�todos getters and setters:

	public int getCodMedicao() {
		return codMedicao;
	}

	public void setCodMedicao(int codMedicao) {
		this.codMedicao = codMedicao;
	}

	public Date getDataMedicao() {
		return dataMedicao;
	}

	public void setDataMedicao(Date dataMedicao) {
		this.dataMedicao = dataMedicao;
	}

	public int getPressaoSistolica() {
		return pressaoSistolica;
	}

	public void setPressaoSistolica(int pressaoSistolica) {
		this.pressaoSistolica = pressaoSistolica;
	}

	public int getPressaoDiastolica() {
		return pressaoDiastolica;
	}

	public void setPressaoDiastolica(int pressaoDiastolica) {
		this.pressaoDiastolica = pressaoDiastolica;
	}

	// M�todos:

	public boolean cadastrarPressaoArterial(Date dataMedicao, int pressaoSistolica, int pressaoDiastolica) {
		boolean cadastroPressaoFinalizado = false;

		return cadastroPressaoFinalizado;
	}

	public ArrayList<PressaoArterial> consultarPressaoArterial(Date dataMedicao) {
		ArrayList<PressaoArterial> listaMedicoes = new ArrayList<>();

		return listaMedicoes;
	}

	public boolean editarPressaoArterial() {
		boolean edicaoPesoFinalizada = false;

		return edicaoPesoFinalizada;
	}

	public boolean excluirPeso() {
		boolean exclusaoPesoFinalizada = false;

		return exclusaoPesoFinalizada;
	}

}

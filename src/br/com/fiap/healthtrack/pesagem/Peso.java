package br.com.fiap.healthtrack.pesagem;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Calendar;

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
	 * Código identificador do registro de peso
	 */
	int codPesagem;
	
	/**
	 * Data de pesagem
	 */
	GregorianCalendar dataPesagem;
	
	/**
	 * Peso (em quilos)
	 */
	double peso;

	// Construtor vazio:

	public Peso() {

	}

	// Métodos getters and setters:

	public int getCodPesagem() {
		return codPesagem;
	}

	public void setCodPesagem(int codPesagem) {
		this.codPesagem = codPesagem;
	}

	public GregorianCalendar getDataPesagemDate() {
		return dataPesagem;
	}

	public void setDataPesagemDate(GregorianCalendar dataPesagemDate) {
		this.dataPesagem = dataPesagemDate;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Métodos:

	/**
	 * Faz o cadastro de um registro de peso
	 * @param dataPesagem
	 * @param peso (em quilos)
	 * @return cadastroPesoFinalizado
	 */
	public boolean cadastrarPeso(int codPesagem, GregorianCalendar dataPesagem, double peso) {
		
		boolean cadastroPesoFinalizado = false;
		
		this.codPesagem = 1;
		this.dataPesagem = dataPesagem;
		this.peso = peso;
		
		// Verificações para adição do número '0' antes de dia e mês caso sejam menores do que 10:
		
		int diaPesagem = dataPesagem.get(Calendar.DAY_OF_MONTH);
		int mesPesagem = dataPesagem.get(Calendar.MONTH);
		String diaPes;
		String mesPes;
		
		if (diaPesagem < 10) {
			diaPes = "0" + diaPesagem;
		} else {
			diaPes = Integer.toString(diaPesagem);
		}
		
		if (mesPesagem < 10) {
			mesPes = "0" + mesPesagem;
		} else {
			mesPes = Integer.toString(mesPesagem);
		}
		
		String dataPesCompleta = diaPes + "/" + mesPes + "/" + dataPesagem.get(Calendar.YEAR);
		
		System.out.println("\nPeso cadastrado com sucesso:\nData: " + dataPesCompleta + "\nPeso: " + peso + " kg");
		
		cadastroPesoFinalizado = true;

		return cadastroPesoFinalizado;
	}
	
	/**
	 * Edita os dados pessoais do usuário
	 * @param dataPesagem
	 * @param peso (em quilos)
	 * @return edicaoPesoFinalizada
	 */
	public boolean editarPeso(int codPesagem, GregorianCalendar dataPesagem, double peso) {
		
		boolean edicaoPesoFinalizada = false;
		
		this.codPesagem = 1;
		this.dataPesagem = dataPesagem;
		this.peso = peso;
		
		// Verificações para adição do número '0' antes de dia e mês caso sejam menores do que 10:
		
		int diaPesagem = dataPesagem.get(Calendar.DAY_OF_MONTH);
		int mesPesagem = dataPesagem.get(Calendar.MONTH);
		String diaPes;
		String mesPes;
		
		if (diaPesagem < 10) {
			diaPes = "0" + diaPesagem;
		} else {
			diaPes = Integer.toString(diaPesagem);
		}
		
		if (mesPesagem < 10) {
			mesPes = "0" + mesPesagem;
		} else {
			mesPes = Integer.toString(mesPesagem);
		}
		
		String dataPesCompleta = diaPes + "/" + mesPes + "/" + dataPesagem.get(Calendar.YEAR);
		
		System.out.println("\nPeso editado com sucesso:\nData: " + dataPesCompleta + "\nPeso: " + peso + " kg");
		
		edicaoPesoFinalizada = true;

		return edicaoPesoFinalizada;
	}
	
	/**
	 * Retorna uma listagem de medições de peso (para exibição do historico e calculo da diferenca na dashboard)
	 * @param dataPesagemConsulta
	 * @return pesoEncontrado
	 */
	public boolean consultarPeso(GregorianCalendar dataPesagemConsulta) {
		
		boolean pesoEncontrado = false;
		
		// Verificações para adição do número '0' antes de dia e mês caso sejam menores do que 10:
		
		int diaPesagemConsulta = dataPesagemConsulta.get(Calendar.DAY_OF_MONTH);
		int mesPesagemConsulta = dataPesagemConsulta.get(Calendar.MONTH);
		int anoPesagemConsulta = dataPesagemConsulta.get(Calendar.YEAR);
		
		String diaPesConsulta;
		String mesPesConsulta;
		
		int diaPesagem = this.dataPesagem.get(Calendar.DAY_OF_MONTH);
		int mesPesagem = this.dataPesagem.get(Calendar.MONTH);
		int anoPesagem = this.dataPesagem.get(Calendar.YEAR);
		
		if (diaPesagemConsulta < 10) {
			diaPesConsulta = "0" + diaPesagemConsulta;
		} else {
			diaPesConsulta = Integer.toString(diaPesagemConsulta);
		}
		
		if (mesPesagemConsulta < 10) {
			mesPesConsulta = "0" + mesPesagemConsulta;
		} else {
			mesPesConsulta = Integer.toString(mesPesagemConsulta);
		}
		
		String dataPesConsultaCompleta = diaPesConsulta + "/" + mesPesConsulta + "/" + dataPesagem.get(Calendar.YEAR);						
				
		if (diaPesagemConsulta == diaPesagem && mesPesagemConsulta == mesPesagem && anoPesagemConsulta == 			anoPesagem ) {
			System.out.println("\nRegistro de peso de " + dataPesConsultaCompleta + " encontrado com sucesso: " + this.peso + " kg.");
		} else {
			System.out.println("\nRegistro de peso de " + dataPesConsultaCompleta + " não encontrado.");
		}

		return pesoEncontrado;
	}

	/**
	 * Exclui o cadastro de peso
	 * @param codPesagem
	 * @return exclusaoPesoFinalizada
	 */
	public boolean excluirPeso(int codPesagem) {
		
		boolean exclusaoPesoFinalizada = false;

		System.out.println("\n\nRegistro de peso excluído com sucesso");

		return exclusaoPesoFinalizada;
	}
}

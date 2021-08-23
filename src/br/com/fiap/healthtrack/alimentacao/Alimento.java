package br.com.fiap.healthtrack.alimentacao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import br.com.fiap.healthtrack.pesagem.Peso;

public class Alimento implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Atributos:
	
	int codAlimento;
	Date dataHoraAlimento;
	String nomeAlimento;
	float energiaKcalAlimento;
	String descricaoAlimento;
	
	// Construtor vazio:
	
	public Alimento() {

	}
	
	// M�todos getters and setters:

	public int getCodAlimento()
	{
		return codAlimento;
	}

	public void setCodAlimento(int codAlimento)
	{
		this.codAlimento = codAlimento;
	}

	public Date getDataHoraAlimento()
	{
		return dataHoraAlimento;
	}

	public void setDataHoraAlimento(Date dataHoraAlimento)
	{
		this.dataHoraAlimento = dataHoraAlimento;
	}

	public String getNomeAlimento()
	{
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento)
	{
		this.nomeAlimento = nomeAlimento;
	}

	public float getEnergiaKcalAlimento()
	{
		return energiaKcalAlimento;
	}

	public void setEnergiaKcalAlimento(float energiaKcalAlimento)
	{
		this.energiaKcalAlimento = energiaKcalAlimento;
	}

	public String getDescricaoAlimento()
	{
		return descricaoAlimento;
	}

	public void setDescricaoAlimento(String descricaoAlimento)
	{
		this.descricaoAlimento = descricaoAlimento;
	}
	
	// M�todos:
	
	public boolean cadastrarAlimento(Date dataHoraAlimento, String nomeAlimento, float energiaKcalAlimento, String descricaoAlimento)
	{
		boolean cadastroPesoFinalizado = false;
		
		return cadastroPesoFinalizado;
		
	}
	
	public ArrayList<Alimento> consultarAlimento(Date dataHoraAlimento)
	{
		ArrayList<Alimento> listaAlimentos = new ArrayList<>();
		
		return listaAlimentos;
	}
	
	public boolean editarAlimento(int codAlimento)
	{
		boolean edicaoAlimentoFinalizada = false;
		
		return edicaoAlimentoFinalizada;
	}
	
	public boolean excluirAlimento(int codAlimento)
	{
		boolean exclusaoAlimentoFinalizada = false;
		
		return exclusaoAlimentoFinalizada;
	}
}

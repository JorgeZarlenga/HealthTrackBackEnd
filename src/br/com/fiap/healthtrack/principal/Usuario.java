package br.com.fiap.healthtrack.principal;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Usuario implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Atributos:
	
	private int codUsuario;
	private String primeiroNome;
	private String sobrenome;
	private Date dataNascimento;
	private char genero;
	private float altura;
	private String email;
	private String senha;
	
	// Construtor vazio:
	
	public Usuario() {

	}
	
	// Métodos getters and setters:
	
	public int getCodUsuario()
	{
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario)
	{
		this.codUsuario = codUsuario;
	}

	public String getPrimeiroNome()
	{
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome)
	{
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome()
	{
		return sobrenome;
	}

	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento()
	{
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	public char getGenero()
	{
		return genero;
	}

	public void setGenero(char genero)
	{
		this.genero = genero;
	}

	public float getAltura()
	{
		return altura;
	}

	public void setAltura(float altura)
	{
		this.altura = altura;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	
	// Métodos:
	
	/**
	 * @author Jorge
	 * Teste
	 */
	public boolean cadastrarUsuario(String primeiroNome, String sobrenome, Date dataNascimento, char genero, float altura, String email, String senha)
	{
		boolean cadastroUsuarioFinalizado = false;
		
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.senha = senha;
		
		cadastroUsuarioFinalizado = true;
		
		return cadastroUsuarioFinalizado;
	}
	
	public boolean editarDadosUsuario(String primeiroNome, String sobrenome, Date dataNascimento, char genero, float altura, String email, String senha)
	{
		boolean edicaoUsuarioFinalizada = false;
		
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.senha = senha;
		
		edicaoUsuarioFinalizada = true;
		
		return edicaoUsuarioFinalizada;
	}
	
	public boolean excluirUsuario(int codUsuario)
	{
		boolean exclusaoUsuarioFinalizada = false;
		
		
		
		exclusaoUsuarioFinalizada = true;
		
		return exclusaoUsuarioFinalizada;
	}
	
	public boolean fazerLogin(String email, String senha)
	{
		boolean loginBemSucedido = false;
		
		return loginBemSucedido;
	}

	public void fazerLogout()
	{
	
	}
	
	public String calcularIdade(Date dataNascimento)
	{
		String idadeString = "";
		
		return idadeString;
	}	
}

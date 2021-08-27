package br.com.fiap.healthtrack.principal;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Classe que abstrai um Usu�rio
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos:

	/**
	 * C�digo identificador do usu�rio
	 */
	private int codUsuario;
	
	/**
	 * Primeiro nome do usu�rio
	 */
	private String primeiroNome;

	/**
	 * Sobrenome do usu�rio
	 */
	private String sobrenome;
	
	/**
	 * Data de nascimento do usu�rio
	 */
	private Date dataNascimento;
	
	/**
	 * G�nero do usu�rio
	 */
	private char genero;
	
	/**
	 * Altura do usu�rio (em metros)
	 */
	private float altura;
	
	/**
	 * Email do usu�rio
	 */
	private String email;
	
	/**
	 * Senha do usu�rio
	 */
	private String senha;

	// Construtor vazio:

	public Usuario() {

	}

	// M�todos getters and setters:

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// M�todos:

	/**
	 * Faz o cadastro do usu�rio
	 * @param Primeiro nome do usu�rio
	 * @param Sobrenome do usu�rio
	 * @param Data de nascimento do usu�rio
	 * @param G�nero do usu�rio
	 * @param Altura do usu�rio (em metros)
	 * @param Email do usu�rio
	 * @param Senha do usu�rio
	 */
	public boolean cadastrarUsuario(String primeiroNome, String sobrenome, Date dataNascimento, char genero,
			float altura, String email, String senha) {
		boolean cadastroUsuarioFinalizado = false;

		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.senha = senha;
		
		System.out.println("Usu�rio cadastrado com sucesso");

		cadastroUsuarioFinalizado = true;

		return cadastroUsuarioFinalizado;
	}

	/**
	 * Edita os dados pessoais do usu�rio
	 * @param Primeiro nome do usu�rio
	 * @param Sobrenome do usu�rio
	 * @param Data de nascimento do usu�rio
	 * @param G�nero do usu�rio
	 * @param Altura do usu�rio (em metros)
	 * @param Email do usu�rio
	 * @param Senha do usu�rio
	 */
	public boolean editarDadosUsuario(String primeiroNome, String sobrenome, Date dataNascimento, char genero,
			float altura, String email, String senha) {
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
	
	/**
	 * Exclui o cadastro do usu�rio
	 * @param C�digo identificador do usu�rio
	 */
	public boolean excluirUsuario(int codUsuario) {
		boolean exclusaoUsuarioFinalizada = false;

		System.out.println("Conta exclu�da com sucesso");

		exclusaoUsuarioFinalizada = true;

		return exclusaoUsuarioFinalizada;
	}

	/**
	 * Efetua a opera��o de login
	 * @param Email do usu�rio
	 * @param Senha do usu�rio
	 */
	public boolean fazerLogin(String email, String senha) {
		boolean loginBemSucedido = false;

		if (this.email == email) {
			if (this.senha == senha) {
				System.out.println("Login bem sucedido");
				loginBemSucedido = true;
			} else {
				System.out.println("Senha inv�lida");
			}
		} else {
			System.out.println("Usu�rio n�o encontrado");
		}

		return loginBemSucedido;
	}

	/**
	 * Efetua a opera��o de logout
	 */
	public void fazerLogout() {
		System.out.println("Logout feito com sucesso");
	}

	/**
	 * Calcula a idade para exibi��o na dashboard
	 * @param Data de nascimento do usu�rio
	 */
	public String calcularIdade(Date dataNascimento) {
		String idadeString = "";

		return idadeString;
	}
}

package br.com.fiap.healthtrack.principal;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Classe que abstrai um Usuário
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
	 * Codigo identificador do usuário
	 */
	private int codUsuario;
	
	/**
	 * Primeiro nome do usuario
	 */
	private String primeiroNome;

	/**
	 * Sobrenome do usuario
	 */
	private String sobrenome;
	
	/**
	 * Data de nascimento do usuario
	 */
	private Date dataNascimento;
	
	/**
	 * Gênero do usuario
	 */
	private char genero;
	
	/**
	 * Altura do usuario (em metros)
	 */
	private float altura;
	
	/**
	 * Email do usuario
	 */
	private String email;
	
	/**
	 * Senha do usuario
	 */
	private String senha;

	// Construtor vazio:

	public Usuario() {

	}

	// Mï¿½todos getters and setters:

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

	// Mï¿½todos:

	/**
	 * Faz o cadastro do usuario
	 * @param Primeiro nome do usuario
	 * @param Sobrenome do usuario
	 * @param Data de nascimento do usuario
	 * @param Gênero do usuario
	 * @param Altura do usuario (em metros)
	 * @param Email do usuario
	 * @param Senha do usuario
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
		
		System.out.println("Usuário cadastrado com sucesso");

		cadastroUsuarioFinalizado = true;

		return cadastroUsuarioFinalizado;
	}

	/**
	 * Edita os dados pessoais do usuário
	 * @param Primeiro nome do usuário
	 * @param Sobrenome do usuário
	 * @param Data de nascimento do usuário
	 * @param Gênero do usuário
	 * @param Altura do usuário (em metros)
	 * @param Email do usuário
	 * @param Senha do usuário
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
	 * Exclui o cadastro do usuario
	 * @param Código identificador do usuario
	 */
	public boolean excluirUsuario(int codUsuario) {
		boolean exclusaoUsuarioFinalizada = false;

		System.out.println("Conta excluida com sucesso");

		exclusaoUsuarioFinalizada = true;

		return exclusaoUsuarioFinalizada;
	}

	/**
	 * Efetua a operaçao de login
	 * @param Email do usuario
	 * @param Senha do usuario
	 */
	public boolean fazerLogin(String email, String senha) {
		boolean loginBemSucedido = false;

		if (this.email == email) {
			if (this.senha == senha) {
				System.out.println("Login bem sucedido");
				loginBemSucedido = true;
			} else {
				System.out.println("Senha invï¿½lida");
			}
		} else {
			System.out.println("Usuario nao encontrado");
		}

		return loginBemSucedido;
	}

	/**
	 * Efetua a operação de logout
	 */
	public void fazerLogout() {
		System.out.println("Logout feito com sucesso");
	}

	/**
	 * Calcula a idade para exibição na dashboard
	 * @param Data de nascimento do usuário
	 */
	public String calcularIdade(Date dataNascimento) {
		String idadeString = "";

		return idadeString;
	}
}

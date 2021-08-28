package br.com.fiap.healthtrack.principal;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
	 * Codigo identificador do usu�rio
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
	 * Data de nascimento do usu�rio
	 */
	private GregorianCalendar dataNascimento;
	
	/**
	 * G�nero do usu�rio
	 */
	private char genero;
	
	/**
	 * Altura do usuario (em metros)
	 */
	private double altura;
	
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

	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
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
	 * @param primeiroNome do usu�rio
	 * @param sobrenome
	 * @param dataNascimento
	 * @param genero do usu�rio
	 * @param altura
	 * @param email
	 * @param senha
	 * @return cadastroUsuarioFinalizado
	 */
	public boolean cadastrarUsuario(int codUsuario, String primeiroNome, String sobrenome, GregorianCalendar dataNascimento, char genero, double altura, String email, String senha) {
		
		boolean cadastroUsuarioFinalizado = false;
		
		this.codUsuario = 1;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.senha = senha;
		
		// Verifica��es para adi��o do n�mero '0' antes de dia e m�s caso sejam menores do que 10:
		
		int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);
		int mesNascimento = dataNascimento.get(Calendar.MONTH);
		String diaNasc;
		String mesNasc;
		
		if (diaNascimento < 10) {
			diaNasc = "0" + diaNascimento;
		} else {
			diaNasc = Integer.toString(diaNascimento);
		}
		
		if (mesNascimento < 10) {
			mesNasc = "0" + mesNascimento;
		} else {
			mesNasc = Integer.toString(mesNascimento);
		}
		
		String dataNascCompleta = diaNasc + "/" + mesNasc + "/" + dataNascimento.get(Calendar.YEAR);
		
		System.out.printf("\nUsu�rio cadastrado com sucesso:\nNome: " + primeiroNome + "\nSobrenome: " + 			sobrenome + "\nData de nascimento: " + dataNascCompleta + "\nG�nero: " + genero + "\nAltura: " + 			altura + " m"  + "\nEmail: " + email + "\n");

		cadastroUsuarioFinalizado = true;

		return cadastroUsuarioFinalizado;
	}

	/**
	 * Edita os dados pessoais do usu�rio
	 * @param primeiroNome - Primeiro nome do usu�rio
	 * @param sobrenome - Sobrenome do usu�rio
	 * @param dataNascimento
	 * @param genero
	 * @param altura - Em metros
	 * @param email
	 * @param senha
	 */
	public boolean editarDadosUsuario(int codUsuario, String primeiroNome, String sobrenome, GregorianCalendar dataNascimento, char genero, double altura, String email, String senha) {
		
		boolean edicaoUsuarioFinalizada = false;
		
		this.codUsuario = 1;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.senha = senha;
		
		// Verifica��es para adi��o do n�mero '0' antes de dia e m�s caso sejam menores do que 10:
		
		int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);
		int mesNascimento = dataNascimento.get(Calendar.MONTH);
		String diaNasc;
		String mesNasc;
		
		if (diaNascimento < 10) {
			diaNasc = "0" + diaNascimento;
		} else {
			diaNasc = Integer.toString(diaNascimento);
		}
		
		if (mesNascimento < 10) {
			mesNasc = "0" + mesNascimento;
		} else {
			mesNasc = Integer.toString(mesNascimento);
		}
		
		String dataNascCompleta = diaNasc + "/" + mesNasc + "/" + dataNascimento.get(Calendar.YEAR);
		
		System.out.printf("\nDados do usu�rio editados com sucesso:\nNome: " + primeiroNome + "\nSobrenome: " + 			sobrenome + "\nData de nascimento: " + dataNascCompleta + "\nG�nero: " + genero + "\nAltura: " + 			altura  + " m"  + "\nEmail: " + email + "\n");

		edicaoUsuarioFinalizada = true;

		return edicaoUsuarioFinalizada;
	}
	
	/**
	 * Exclui o cadastro do usu�rio
	 * @param codUsuario
	 */
	public boolean excluirUsuario(int codUsuario) {
		
		boolean exclusaoUsuarioFinalizada = false;

		System.out.println("\nConta exclu�da com sucesso.");

		exclusaoUsuarioFinalizada = true;

		return exclusaoUsuarioFinalizada;
	}

	/**
	 * Efetua a opera��o de login
	 * @param email
	 * @param senha
	 */
	public boolean fazerLogin(String email, String senha) {
		
		boolean loginBemSucedido = false;

		if (this.email == email) {
			if (this.senha == senha) {
				System.out.println("\nLogin bem sucedido.");
				loginBemSucedido = true;
			} else {
				System.out.println("\nSenha inv�lida.");
			}
		} else {
			System.out.println("\nUsu�rio n�o encontrado.");
		}

		return loginBemSucedido;
	}

	/**
	 * Efetua a opera��o de logout
	 */
	public void fazerLogout() {
		
		System.out.println("\nLogout feito com sucesso.");
	}

	/**
	 * Calcula a idade para exibi��o no dashboard
	 * @param dataNascimento
	 */
	public String calcularIdade(GregorianCalendar dataNascimento) {
		
		String idadeString;
		int anoNascimento = dataNascimento.get(Calendar.YEAR);
		int mesNascimento = dataNascimento.get(Calendar.MONTH);
		int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);

		LocalDate dataNasc = LocalDate.of(anoNascimento, mesNascimento, diaNascimento); // Ano, m�s e dia

		// Captura a data atual
		LocalDate agora = LocalDate.now();
		
		// C�lculo da diferen�a entre as datas
		Period diferenca = Period.between(dataNasc, agora);
		
		// Concatena��o da frase para exibi��o
		idadeString = "\nIdade: " + diferenca.getYears() + " anos, " + diferenca.getMonths() + " meses e " + 			diferenca.getDays() + " dias."; 
		
		System.out.println(idadeString);

		return idadeString;
	}
}

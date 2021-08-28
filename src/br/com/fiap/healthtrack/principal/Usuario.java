package br.com.fiap.healthtrack.principal;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
	 * Data de nascimento do usuário
	 */
	private GregorianCalendar dataNascimento;
	
	/**
	 * Gênero do usuário
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

	// Métodos getters and setters:

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

	// Métodos:

	/**
	 * Faz o cadastro do usuário
	 * @param primeiroNome do usuário
	 * @param sobrenome
	 * @param dataNascimento
	 * @param genero do usuário
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
		
		// Verificações para adição do número '0' antes de dia e mês caso sejam menores do que 10:
		
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
		
		System.out.printf("\nUsuário cadastrado com sucesso:\nNome: " + primeiroNome + "\nSobrenome: " + 			sobrenome + "\nData de nascimento: " + dataNascCompleta + "\nGênero: " + genero + "\nAltura: " + 			altura + " m"  + "\nEmail: " + email + "\n");

		cadastroUsuarioFinalizado = true;

		return cadastroUsuarioFinalizado;
	}

	/**
	 * Edita os dados pessoais do usuário
	 * @param primeiroNome - Primeiro nome do usuário
	 * @param sobrenome - Sobrenome do usuário
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
		
		// Verificações para adição do número '0' antes de dia e mês caso sejam menores do que 10:
		
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
		
		System.out.printf("\nDados do usuário editados com sucesso:\nNome: " + primeiroNome + "\nSobrenome: " + 			sobrenome + "\nData de nascimento: " + dataNascCompleta + "\nGênero: " + genero + "\nAltura: " + 			altura  + " m"  + "\nEmail: " + email + "\n");

		edicaoUsuarioFinalizada = true;

		return edicaoUsuarioFinalizada;
	}
	
	/**
	 * Exclui o cadastro do usuário
	 * @param codUsuario
	 */
	public boolean excluirUsuario(int codUsuario) {
		
		boolean exclusaoUsuarioFinalizada = false;

		System.out.println("\nConta excluída com sucesso.");

		exclusaoUsuarioFinalizada = true;

		return exclusaoUsuarioFinalizada;
	}

	/**
	 * Efetua a operação de login
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
				System.out.println("\nSenha inválida.");
			}
		} else {
			System.out.println("\nUsuário não encontrado.");
		}

		return loginBemSucedido;
	}

	/**
	 * Efetua a operação de logout
	 */
	public void fazerLogout() {
		
		System.out.println("\nLogout feito com sucesso.");
	}

	/**
	 * Calcula a idade para exibição no dashboard
	 * @param dataNascimento
	 */
	public String calcularIdade(GregorianCalendar dataNascimento) {
		
		String idadeString;
		int anoNascimento = dataNascimento.get(Calendar.YEAR);
		int mesNascimento = dataNascimento.get(Calendar.MONTH);
		int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);

		LocalDate dataNasc = LocalDate.of(anoNascimento, mesNascimento, diaNascimento); // Ano, mês e dia

		// Captura a data atual
		LocalDate agora = LocalDate.now();
		
		// Cálculo da diferença entre as datas
		Period diferenca = Period.between(dataNasc, agora);
		
		// Concatenação da frase para exibição
		idadeString = "\nIdade: " + diferenca.getYears() + " anos, " + diferenca.getMonths() + " meses e " + 			diferenca.getDays() + " dias."; 
		
		System.out.println(idadeString);

		return idadeString;
	}
}

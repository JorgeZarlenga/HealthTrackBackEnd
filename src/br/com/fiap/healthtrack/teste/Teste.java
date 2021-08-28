package br.com.fiap.healthtrack.teste;

import br.com.fiap.healthtrack.pesagem.Peso;
import br.com.fiap.healthtrack.principal.Usuario;

import java.util.GregorianCalendar;

public class Teste {

	public static void main(String[] args) {
		
		// *********** Testes dos m�todos da classe Usuario ***********
		
		System.out.println("*********** Teste da classe Usuario ***********");
		
		Usuario usuario = new Usuario();
		
		// Teste de cadastro de usu�rio com dia e m�s menores do que 10:
		System.out.println("Teste de cadastro de usu�rio com dia e m�s menores do que 10:");
		usuario.cadastrarUsuario(1, "Jos�", "Silva", new GregorianCalendar(1993, 9, 9), 'M', 1.68, "jose.silva@dominio.com", "123");
		
		// Teste de cadastro de usu�rio com dia e m�s maiores ou iguais a 10:
		System.out.println("Teste de cadastro de usu�rio com dia e m�s maiores ou iguais a 10:");
		usuario.cadastrarUsuario(1, "Jos�", "Silva", new GregorianCalendar(1993, 10, 10), 'M', 1.68, "jose.silva@dominio.com", "123");
		
		// Teste de edi��o dos dados de usu�rio com dia e m�s menores do que 10:
		usuario.editarDadosUsuario(1, "Jos�", "Silva", new GregorianCalendar(1992, 6, 5), 'M', 1.66, "jose.silva@dominio.com", "1234");
		
		// Teste de edi��o de usu�rio com dia e m�s maiores ou iguais a 10:
		usuario.editarDadosUsuario(1, "Jos�", "Silva", new GregorianCalendar(1992, 10, 10), 'M', 1.66, "jose.silva@dominio.com", "1234");
		
		usuario.excluirUsuario(1);
		
		// Teste de login bem sucedido:
		usuario.fazerLogin("jose.silva@dominio.com", "1234");
		
		// Teste de login com senha inv�lida:
		usuario.fazerLogin("jose.silva@dominio.com", "123");
		
		// Teste de login com usu�rio inv�lido:
		usuario.fazerLogin("jose@dominio.com", "123");
		
		usuario.fazerLogout();
		
		// Teste de c�lculo de idade:
		usuario.calcularIdade(new GregorianCalendar(1992, 10, 5));
		
		// *********** Testes dos m�todos da classe Peso ***********
		
		System.out.println("\n*********** Teste da classe Peso ***********");
		
		Peso peso = new Peso();

		// Teste de cadastro de registro de peso com dia e m�s menores do que 10:
		peso.cadastrarPeso(1, new GregorianCalendar(2021, 8, 8), 65.4);
		
		// Teste de cadastro de registro de peso com dia e m�s maiores ou iguais a 10:
		peso.cadastrarPeso(1, new GregorianCalendar(2021, 10, 10), 65.4);
		
		// Teste de edi��o de registro de peso com dia e m�s menores do que 10:
		peso.editarPeso(1, new GregorianCalendar(2021, 9, 9), 65.4);
		
		// Teste de edi��o de registro de peso com dia e m�s maiores ou iguais a 10:
		peso.editarPeso(1, new GregorianCalendar(2021, 8, 27), 65.4);
		
		// Teste de peso encontrado:
		peso.consultarPeso(new GregorianCalendar(2021, 8, 27));

		// Teste de peso n�o encontrado:
		peso.consultarPeso(new GregorianCalendar(2021, 8, 26));
	}
}

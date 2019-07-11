import java.util.Date;
import java.util.Scanner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CadastrarNovoAluguel {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome de usu�rio :");
		funcionarios funcionario1 = new funcionarios();
		funcionario1.nome = sc.nextLine();
		
		System.out.println("Bem vindo " + funcionario1.nome + " tenha um bom dia trabalhando na Paladino Games");
		System.out.println(" =========================================================================== ");
		System.out.println(" Digite o c�digo abaixo para executar uma fun��o:");
		System.out.println(" 1 - Cadastrar novo aluguel ");
		System.out.println(" 2 - Cadastrar novo uso de console na loja");
		System.out.println(" 3 - Fechar o sistema");
		System.out.println(" =========================================================================== ");
		
		int operacaoExecutada = sc.nextInt();
		
		if (operacaoExecutada == 1) {
	
				
			System.out.println("Insira o c�digo de identifica��o do cliente: ");
			
			Cliente cliente1ID = new Cliente();
			cliente1ID.id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Qual o nome do cliente? ");
			
			Cliente cliente1 = new Cliente();
			cliente1.nome = sc.nextLine();

			System.out.println("Para qual plataforma � o jogo a ser alugado?");
			
			Plataforma plataforma1 = new Plataforma();
			plataforma1.nome = sc.nextLine();
			System.out.println(" \n ");
			
			System.out.println("Qual jogo o(a) cliente " + cliente1.nome + " gostaria de alugar?");
			jogo jogoalugado = new jogo();
			jogoalugado.titulo = sc.nextLine();
			
			System.out.println("Favor inserir o valor da di�ria dos jogos do " + plataforma1.nome);
			JogoPlataforma diariasDeLocacao = new JogoPlataforma();
			diariasDeLocacao.precoDiario = sc.nextDouble();
			
			System.out.println("Por quantos dias o(a) cliente " + cliente1.nome + " gostaria de alugar " + jogoalugado.titulo + " . ");
			
			ItemDeLocacao dadosDaLocacao = new ItemDeLocacao();
			dadosDaLocacao.dias = sc.nextInt();
			
			System.out.println(" ==== AGUARDANDO O REGISTRO DOS DADOS INFORMADOS ======== ");
			
			System.out.println("=========================================================");
			
			System.out.println(" =============== DADOS DA LOCA��O =======================");
			System.out.println(" Nome do(a) Cliente :" + cliente1.nome);
			System.out.println(" Jogo e plataforma alugados : " + jogoalugado.titulo + " | " + plataforma1.nome );
			System.out.println(" Di�rias : " + dadosDaLocacao.dias + " | Valor da di�ria : R$ " + diariasDeLocacao.precoDiario );
			System.out.println(" Valor a ser pago pelo cliente " + cliente1.nome + " � de : R$ " + diariasDeLocacao.precoDiario * dadosDaLocacao.dias);

		}
		else if (operacaoExecutada == 2) {
			
			System.out.println("Cadastre o C�digo do Cliente :");
			
			Cliente clienteUsoLoja1 = new Cliente();
			clienteUsoLoja1.id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Qual o nome do usu�rio? ");

			clienteUsoLoja1.nome = sc.nextLine();
			
			System.out.println("Qual o hor�rio de in�cio da utiliza��o?");
		
			Utilizacao ClienteUsoLoja1 = new Utilizacao();
			ClienteUsoLoja1.horaDeinicio = sc.nextInt();
			
			System.out.println("Qual � o hor�rio de fim da utiliza��o?");
			
			ClienteUsoLoja1.horaDeFinalizacao = sc.nextInt();
			
			System.out.println("Qual o Console ser� usado pelo usu�rio " + clienteUsoLoja1.nome + " ? ");
			
			Console ClienteUsoConsole1 = new Console();
			ClienteUsoConsole1.name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("O valor da hora por uso do console " + ClienteUsoConsole1.name + " � de :");
			ClienteUsoConsole1.precoPorHora = sc.nextDouble();
			

			
			System.out.println( " ======================================================= ");
			System.out.println(" =========== NOTA DE SERVI�O ===========================");
			
			System.out.println("Cliente : " + clienteUsoLoja1.nome);
			System.out.println("Iniciou o uso �s : " + ClienteUsoLoja1.horaDeinicio + " horas. ");
			System.out.println("Terminou de usar �s : " + ClienteUsoLoja1.horaDeFinalizacao + " horas. ");
			System.out.println("Valor a ser pago pelo uso; " + ((ClienteUsoConsole1.precoPorHora) * (ClienteUsoLoja1.horaDeFinalizacao - ClienteUsoLoja1.horaDeinicio))); 
			
		}
		else if (operacaoExecutada > 3) {
			System.out.println("Voc� digitou n�mero inv�lido. O programa ser� encerrado");
		}
		else {
			System.out.println("Fechando");

		}
		
		System.out.println(" ========================================================== ");
		
		System.out.println("Encerrando programa");
		
			
			sc.close();
		}
		
		

		
		
		
		
		

	}


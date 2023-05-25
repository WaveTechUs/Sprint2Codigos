package util;

import java.util.Scanner;

import lista.Pilha;
import lista.Pilha.Retorno;
import teste.Teste;

public class Util {
	private Scanner sc = new Scanner(System.in);
	public void start() {
		Pilha pilha = new Pilha();
		Teste teste = new Teste(pilha);
		int escolha;
		boolean continua;
		
		do {
			escolha =menu(pilha.isEmpty());
			continua = acao(escolha, teste);
		}while(continua);
		
		
	}
	
	public int menu(Boolean pilhaVazia) {
		int escolha;
		do {
			System.out.println("=====================================");
			System.out.println("1- Adicionar na Pilha");
			if(!pilhaVazia) {
				System.out.println("2- Verificar Topo");
				System.out.println("3- Verificar Proximo");
				System.out.println("4- Verificar Pilha");
				System.out.println("5- Remover");
			}
			System.out.println("6- Sair");
			System.out.println("=====================================");
			System.out.println("Escolha um numero: ");
			escolha = sc.nextInt();	
			if(escolha > 1 && escolha < 6 && !pilhaVazia) {
				break;
			}
		}while(escolha != 1 && escolha != 6);
		return escolha;
	}
	
	public boolean acao(int escolha, Teste teste) {
		boolean continua = true;
		switch (escolha) {
	    case 1:
	    	teste.adicionou();
	    	break;
	    case 2:
	    	teste.checkTopo();
	    	break;
	    case 3:
	    	teste.checkProximo();
	    	break;
	    case 4:
	    	System.out.println("Os Valores dentro da Pilha (top para baixo): ");
	    	teste.showPilha();
	    	System.out.println("null");
	    	break;
	    case 5:
	    	System.out.println("Valor removido:");
	    	teste.removeu();
	    	break;
	    case 6:
	    	System.out.println("Você saiu!!");
	    	continua = false;
		}
		return continua;
	}
}

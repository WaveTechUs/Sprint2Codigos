package teste;

import java.util.Scanner;

import lista.Pilha;
import lista.Pilha.Retorno;

public class Teste {
	
	private Pilha pilha;

	public Teste(Pilha pilha) {
		super();
		this.pilha = pilha;
		this.pilha.init();
	}
	
	public void adicionou() {
		Scanner sc = new Scanner(System.in);
		if(pilha.isEmpty()) {
			System.out.println("Digite o dado que quer inserir");
			String dado = sc.nextLine();
			pilha.push(dado);
			System.out.println("Foi adicionado: " + dado);
		}
		else {
			boolean pertence;
			do {
				System.out.println("Digite o dado que quer inserir");
				String dado = sc.nextLine();
				pertence = pertence(dado);
				if(pertence) {
					System.out.println("Esse dado já foi inserido!");
				}
				else {
					pilha.push(dado);
					System.out.println("Foi adicionado: " + dado);
				}
			}while(pertence);
		}
	}
	
	public void removeu() {
		if(!pilha.isEmpty()) {
			pilha.pop();
		}
	}
	
	public boolean pertence(String dado) {
		String[] telas = pilha.getPilha();
		boolean pertence = false;
		for(int i =0; i<telas.length;i++) {
			if(telas[i].equals(dado)) {
				pertence = true;
				break;
			}
		}
		return pertence;
	}
	
	
	public void checkTopo() {
		Retorno retorno = pilha.top();
		if(retorno.ok){
			System.out.println("Valor do topo é: " + retorno.item);
		}else{
			System.out.println("Topo está vazio");
		}
	}
	
	public void checkProximo() {
		if(!pilha.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o dado que quer checar");
			String dado = sc.nextLine();
			if(pilha.getNo(dado) != null && pilha.getProximo(pilha.getNo(dado)) != null) {
				System.out.println("Dado do nó escolhido: " + pilha.getTela(pilha.getNo(dado)));
				System.out.println("Proximo dado é: " + pilha.getTela(pilha.getProximo(pilha.getNo(dado))));
			}
			else {
				System.out.println("Proximo dado é: Nulo");
			}
		}
		else {
			System.out.println("Não há valor na pilha");
		}

	}
	
	public void showPilha()
	{
		String[] telas = pilha.getPilha();
		for(int i =0; i<telas.length;i++) {
			System.out.println(telas[i]);
		}
	}
}

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
		if (pilha.isEmpty()) {
			System.out.println("Digite a tela que deseja inserir");
			String dado = sc.nextLine();
			pilha.push(dado);
			System.out.println("Foi adicionado: " + dado);
		} else {
			boolean pertence;
			do {
				System.out.println("Digite o nome da tela que deseja inserir");
				String dado = sc.nextLine();
				pertence = pertence(dado);
				if (pertence) {
					System.out.println("Essa tela já foi inserido!");
				} else {
					pilha.push(dado);
					System.out.println("Foi adicionado: " + dado);
				}
			} while (pertence);
		}
	}

	public void removeu() {
		if (!pilha.isEmpty()) {
			pilha.pop();
		}
	}

	public boolean pertence(String dado) {
		String[] telas = pilha.getPilha();
		boolean pertence = false;
		for (int i = 0; i < telas.length; i++) {
			if (telas[i].equals(dado)) {
				pertence = true;
				break;
			}
		}
		return pertence;
	}

	public void checkTopo() {
		Retorno retorno = pilha.top();
		if (retorno.ok) {
			System.out.println("A tela do topo é: " + retorno.item);
		} else {
			System.out.println("Topo está vazio");
		}
	}

	public void checkProximo() {
		if(pilha.isEmpty()) {
			System.out.println("Não há tela na pilha");
			return;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o a tela que quer checar");
		String dado = sc.nextLine();
		
		if(pilha.getNo(dado) == null) {
			System.out.println("Esta tela não existe");
			return;
		}

		if (pilha.getProximo(pilha.getNo(dado)) != null) {
			System.out.println("Tela escolhida escolhido: " + pilha.getTela(pilha.getNo(dado)));
			System.out.println("Proxima tela é: " + pilha.getTela(pilha.getProximo(pilha.getNo(dado))));
		} else {
			System.out.println("Esta é a última tela da pilha");
		}

	}

	public void showPilha() {
		String[] telas = pilha.getPilha();
		for (int i = 0; i < telas.length; i++) {
			System.out.println(telas[i]);
		}
	}

}

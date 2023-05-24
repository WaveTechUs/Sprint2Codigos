package main;

import lista.Pilha;
import teste.Teste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Pilha pilha = new Pilha();
		Teste teste = new Teste(pilha);
		
		teste.adicionou();
		
		teste.adicionou();
		System.out.println(pilha.getTopo());
		teste.checkProximo();

	}

}

package lista;

public class Pilha {

	private static class No {
		public String tela;
		public No proximo;
	}

	public static class Retorno {
		public String item;
		public boolean ok;
	}

	private static No topo;

	public void init() {
		topo = null;
	}

	public boolean isEmpty() {
		return topo == null;
	}

	public void push(String tela) {
		No novo = new No();
		novo.tela = tela;
		novo.proximo = topo;
		topo = novo;
	}

	public Retorno pop() {
		Retorno retorno = new Retorno();

		if (!isEmpty()) {
			retorno.item = topo.tela;
			topo = topo.proximo;
			retorno.ok = true;
		} else {
			retorno.ok = false;
		}
		System.out.println(retorno.item);
		return retorno;
	}

	public Retorno top() {
		Retorno retorno = new Retorno();
		if (!isEmpty()) {
			retorno.item = topo.tela;
			retorno.ok = true;
		} else {
			retorno.ok = false;
		}
		
		return retorno;
	}
	public No getTopo() {
		return topo;
	}
	
	public String getTela(No no) {
		return no.tela;
	}
	public No getProximo(No no) {
		return no.proximo;
	}
	
	public No getNo(String dado) {
		No aux = topo;
		while( aux != null && !aux.tela.equals(dado) ) {
			aux = aux.proximo;
		}
		return aux;
	}
	
	public int getLength() {
		No aux = topo;
		int count = 1;
		if(!isEmpty()) {
			while(aux.proximo != null ) {
				aux = aux.proximo;
				count ++;
			}
		}
		return count;
	}
	
	public String[] getPilha() {
		String[] dados = new String[getLength()];
		if(!isEmpty()) {
			int count =0;
			No aux = topo;
			while(aux != null ) {
				dados[count] = aux.tela;
				aux = aux.proximo;
				count ++;
			}
		}
		return dados;
	}
}

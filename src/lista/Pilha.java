package lista;

public class Pilha {

	private static class No {
		public String tela;
		public No proximo;
	}

	private static class Retorno {
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
}

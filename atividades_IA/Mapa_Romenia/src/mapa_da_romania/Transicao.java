package mapa_da_romania;

public class Transicao {

	private Estado estadoDest;
	private int custoAresta;
	
	
	public Transicao(Estado estadoDest, int custoAresta) {
		super();
		this.estadoDest = estadoDest;
		this.custoAresta = custoAresta;
	}
	
	public Estado getEstadoDest() {
		return estadoDest;
	}
	public void setEstadoDest(Estado estadoDest) {
		this.estadoDest = estadoDest;
	}
	public int getCustoAresta() {
		return custoAresta;
	}
	public void setCustoAresta(int custoAresta) {
		this.custoAresta = custoAresta;
	}
	
	
}

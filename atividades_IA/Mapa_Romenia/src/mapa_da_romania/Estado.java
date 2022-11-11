package mapa_da_romania;


import java.util.ArrayList;

public class Estado {

	private String nome;
	private ArrayList<Transicao> listAdj = new ArrayList<Transicao>();
	
	public Estado() {}
	public Estado(String nome) {
		this.nome = nome;
	}
	public Estado(String nome, ArrayList<Transicao> listAdj) {
		this.nome = nome;
		this.listAdj = listAdj;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Transicao> getListAdj() {
		return listAdj;
	}
	public void setListAdj(Transicao listAdj) {
		this.listAdj.add(listAdj);
	}
	
}

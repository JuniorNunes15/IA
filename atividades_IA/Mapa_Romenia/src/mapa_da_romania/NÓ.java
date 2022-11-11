package mapa_da_romania;

import java.util.ArrayList;

public class NÓ implements Comparable<NÓ>{
	private Estado estado;
	private NÓ pai;
	private ArrayList<Transicao> acao = new ArrayList<Transicao>();
	private int custo;
	
	public NÓ() {}
	public NÓ(Estado estado,ArrayList<Transicao> acao, int custo) {
		this.estado = estado;
		this.acao = acao;
		this.custo = custo;
	}
	public NÓ(Estado estado, NÓ pai, ArrayList<Transicao> acao, int custo) {
		this.estado = estado;
		this.pai = pai;
		this.acao = acao;
		this.custo = custo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public NÓ getPai() {
		return pai;
	}
	public void setPai(NÓ pai) {
		this.pai = pai;
	}
	
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public ArrayList<Transicao> getAcao() {
		return acao;
	}
	public void setAcao(ArrayList<Transicao> acao) {
		this.acao = acao;
	}
	public void trajeto(NÓ no){
		NÓ i = new NÓ();
		i = no;
		while(true){
			if(i == null) break;
			System.out.println(i.getEstado().getNome());
			i = i.getPai();
		}
	}
	public int compareTo(NÓ i) {
		return (this.custo - i.getCusto());
	}	
}

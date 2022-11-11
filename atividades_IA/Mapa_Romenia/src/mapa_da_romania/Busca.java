package mapa_da_romania;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class Busca {
	//funcoes auxiliares
	public boolean contemEstado(NÓ noo, ArrayList<NÓ> no) {
		for(NÓ n : no) {
			if(n.getEstado() == noo.getEstado()) return true;			
		}
		return false;
	}
	public boolean comparaCusto(NÓ noo, PriorityQueue<NÓ> no) {
		for(NÓ n : no) {
			if(n.getCusto() > noo.getCusto()) return true;
		}
		return false;
	}	
	public NÓ buscaLargura(Estado inicio , Estado destino) {
		ArrayList<NÓ> borda = new ArrayList<NÓ>();
		ArrayList<NÓ> explorados = new ArrayList<NÓ>();
		NÓ no = new NÓ(inicio,null,inicio.getListAdj(),0);
		borda.add(no);
		while(true) {
			if(borda.isEmpty()) {
				return null;
				// Nao tem mais pra onde ir 
			}
			no = borda.get(0);
			borda.remove(0);
			explorados.add(no);
			for(Transicao t : no.getAcao()) {
				NÓ filho = new NÓ(	t.getEstadoDest(),
									no,
									t.getEstadoDest().getListAdj(),
									t.getCustoAresta()+no.getCusto());
				if( !(contemEstado(filho, explorados)) && 
					!(contemEstado(filho,borda))) {
					if(filho.getEstado() == destino) {
						return filho;
					}
					borda.add(filho);
				}
			}
		}		
	}
	public NÓ buscaProfundidade(Estado inicio, Estado destino){
		Pilha borda = new Pilha();
		ArrayList<NÓ> explorados = new ArrayList<NÓ>();
		NÓ no = new NÓ(inicio,inicio.getListAdj(),0);
		borda.insere(no);
		while(true) {
			if(borda.vazio()) {
				return null;
				// Nao tem mais pra onde ir 
			}
			no = borda.inicio();
			borda.remove();
			explorados.add(no);
			for(Transicao t : no.getAcao()) {
				NÓ filho = new NÓ(	t.getEstadoDest(),
									no,
									t.getEstadoDest().getListAdj(),
									t.getCustoAresta()+no.getCusto());
				if( !(contemEstado(filho, explorados)) && 
					!(borda.possui(filho))) {
					if(filho.getEstado() == destino) {
						return filho;
					}
					borda.insere(filho);
				}
			}
		}
	}
	
	public NÓ buscaCustoUniforme(Estado inicio , Estado destino) {
		PriorityQueue<NÓ> borda = new PriorityQueue<NÓ>();
		ArrayList<NÓ> explorados = new ArrayList<NÓ>();
		NÓ no = new NÓ(inicio,inicio.getListAdj(),0);
		borda.add(no); 
		while(true) {
			if(borda.isEmpty()) {
				return null; 
			}
			
			no = borda.peek();
			borda.remove(no);
			if(no.getEstado() == destino) return no;
			explorados.add(no);
			for(Transicao t : no.getAcao()) {
				NÓ filho = new NÓ(	t.getEstadoDest(),
									no,
									t.getEstadoDest().getListAdj(),
									t.getCustoAresta()+no.getCusto());
				if( !(contemEstado(filho, explorados)) && 
					!(borda.contains(filho))) {
					borda.add(filho);
				}
				else if(comparaCusto(filho, borda)) {
					borda.add(filho);
				}
			}
		}		
	}
}

package mapa_da_romania;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<NÓ> pilha = new ArrayList<NÓ>();

    public Pilha(){}
    public void insere(NÓ no){
        this.pilha.add(no);
    }
    public void remove(){
        this.pilha.remove(this.pilha.size()-1);
    }
    public NÓ inicio(){
        return this.pilha.get(this.pilha.size()-1);
    }
    public boolean vazio(){
        if(this.pilha.isEmpty()) return true;
        return false;
    }
    public boolean possui(NÓ no){
        if(this.pilha.contains(no)) return true;
        return false;
    }     
}

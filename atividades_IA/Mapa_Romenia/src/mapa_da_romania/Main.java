package mapa_da_romania;

public class Main {

	public static void main(String[] args) {
		
		Estado arad = new Estado("Arad"); 
		Estado oradea = new Estado("oradea"); 
		Estado zerind = new Estado("zerid"); 
		Estado timisoara = new Estado("timisoara"); 
		Estado lugoj = new Estado("lugoj"); 
		Estado mehadia = new Estado("mehadia"); 
		Estado drobeta = new Estado("drobeta"); 
		Estado sibiu = new Estado("sibiu"); 
		Estado fagaras = new Estado("fagaras"); 
		Estado rimnicuVilcea = new Estado("rimnicuVilcea"); 
		Estado craiova = new Estado("craiova"); 
		Estado pitesti = new Estado("pitesti"); 
		Estado bucharest = new Estado("buchaest"); 
		Estado giurgiu = new Estado("giurgiu"); 
		Estado urziceni = new Estado("urziceni"); 
		Estado eforie = new Estado("eforie"); 
		Estado hirsova = new Estado("hirsova"); 
		Estado vaslui = new Estado("vaslui"); 
		Estado iasi = new Estado("iasi"); 
		Estado neamt = new Estado("neamt");
		
		Transicao a_timisoara = new Transicao(timisoara, 118);
		Transicao a_zerind = new Transicao(zerind, 75);
		Transicao a_sibiu = new Transicao(sibiu, 140);
		arad.setListAdj(a_timisoara);
		arad.setListAdj(a_zerind);
		arad.setListAdj(a_sibiu);
		
		
		Transicao z_arad = new Transicao(arad, 75);
		Transicao z_oradea = new Transicao(oradea, 71);
		zerind.setListAdj(z_arad);
		zerind.setListAdj(z_oradea);
		
		Transicao t_arad = new Transicao(arad, 118);
		Transicao t_lugoj = new Transicao(lugoj, 111);
	    timisoara.setListAdj(t_arad);
	    timisoara.setListAdj(t_lugoj);
	    
	    Transicao s_arad = new Transicao(arad, 140);
	    Transicao s_oradea = new Transicao(oradea, 151);
	    Transicao s_fagaras = new Transicao(fagaras, 99);
	    Transicao s_rinnicu = new Transicao(rimnicuVilcea, 80);
	    sibiu.setListAdj(s_arad);
	    sibiu.setListAdj(s_oradea);
	    sibiu.setListAdj(s_fagaras);
	    sibiu.setListAdj(s_rinnicu);
	    
	    Transicao o_zerind = new Transicao(zerind, 71);
	    Transicao o_sibiu = new Transicao(sibiu, 151);
	    oradea.setListAdj(o_zerind);
	    oradea.setListAdj(o_sibiu);
	    
	    Transicao l_timisoara = new Transicao(timisoara, 111);
	    Transicao l_mehadia = new Transicao(mehadia, 70);
	    lugoj.setListAdj(l_timisoara);
	    lugoj.setListAdj(l_mehadia);
	    
	    Transicao m_lugoj = new Transicao(lugoj, 70);
	    Transicao m_drobeta = new Transicao(drobeta, 75);
	    mehadia.setListAdj(m_lugoj);
	    mehadia.setListAdj(m_drobeta);
	    
	    Transicao d_mehadia = new Transicao(mehadia, 75);
	    Transicao d_craiova = new Transicao(craiova, 120);
	    drobeta.setListAdj(d_mehadia);
	    drobeta.setListAdj(d_craiova);
	    
	    Transicao c_drobeta = new Transicao(drobeta, 120);
	    Transicao c_rimnicu = new Transicao(rimnicuVilcea, 146);
	    Transicao c_pitesti = new Transicao(pitesti, 138);
	    craiova.setListAdj(c_drobeta);
	    craiova.setListAdj(c_rimnicu);
	    craiova.setListAdj(c_pitesti);
	    
	    Transicao r_sibiu = new Transicao(sibiu, 80);
	    Transicao r_craiova = new Transicao(craiova, 146);
	    Transicao r_pitesti = new Transicao(pitesti, 97);
	    rimnicuVilcea.setListAdj(r_sibiu);
	    rimnicuVilcea.setListAdj(r_craiova);
	    rimnicuVilcea.setListAdj(r_pitesti);
	    
	    Transicao p_rimnicu = new Transicao(rimnicuVilcea, 97);
	    Transicao p_craiova = new Transicao(craiova, 138);
	    Transicao p_bucharest = new Transicao(bucharest, 101);
	    pitesti.setListAdj(p_rimnicu);
	    pitesti.setListAdj(p_craiova);
	    pitesti.setListAdj(p_bucharest);
	    
	    Transicao f_sibiu = new Transicao(sibiu, 99);
	    Transicao f_bucharest = new Transicao(bucharest, 211);
	    fagaras.setListAdj(f_sibiu);
	    fagaras.setListAdj(f_bucharest);
	    
	    Transicao b_fagaras = new Transicao(fagaras, 211);
	    Transicao b_pitesti = new Transicao(fagaras, 101);
	    Transicao b_giurgiu = new Transicao(giurgiu, 90);
	    Transicao b_urziceni = new Transicao(urziceni, 85);
	    bucharest.setListAdj(b_fagaras);
	    bucharest.setListAdj(b_pitesti);
	    bucharest.setListAdj(b_giurgiu);
	    bucharest.setListAdj(b_urziceni);
	    
	    Transicao g_bucharest = new Transicao(bucharest, 90);
	    giurgiu.setListAdj(g_bucharest);
	    
	    Transicao u_bucharest = new Transicao(bucharest, 85);
	    Transicao u_hirsova = new Transicao(hirsova, 98);
	    Transicao u_vaslui = new Transicao(vaslui, 142);
	    urziceni.setListAdj(u_bucharest);
	    urziceni.setListAdj(u_hirsova);
	    urziceni.setListAdj(u_vaslui);
	    
	    Transicao h_urziceni = new Transicao(urziceni, 98);
	    Transicao h_eforie = new Transicao(eforie, 86);
	    hirsova.setListAdj(h_urziceni);
	    hirsova.setListAdj(h_eforie);
	    
	    Transicao e_hirsova = new Transicao(hirsova, 86);
	    eforie.setListAdj(e_hirsova);
	    
	    Transicao v_urziceni = new Transicao(urziceni, 142);
	    Transicao v_iasi = new Transicao(iasi, 92);
	    vaslui.setListAdj(v_urziceni);
	    vaslui.setListAdj(v_iasi);
	    
	    Transicao i_vaslui = new Transicao(vaslui, 92);
	    Transicao i_neamt = new Transicao(neamt, 87);
	    iasi.setListAdj(i_vaslui);
	    iasi.setListAdj(i_neamt);
	    
	    Transicao n_iasi = new Transicao(iasi, 87);
	    neamt.setListAdj(n_iasi);
	    //Estado ceara = new Estado("Ceará");
	    Busca busca = new Busca();
		NÓ sol = busca.buscaProfundidade(timisoara, bucharest);
		System.out.println(sol.getCusto());
		//NÓ sol = busca.buscaProfundidade(arad, craiova);
		//sol.trajeto(sol);
	}
}

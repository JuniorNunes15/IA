
public class Agent {
	
	public Action act(Perception p) {
		
		Action act = new Action(null);
		
		if(!p.isDirty()) {
			if(p.isLocation()) {
				
				act.setName("Direita");
				return act;
			}
			else {
				act.setName("Esquerda");
				return act;
			}
		}
		else {
			act.setName("Aspirou");
			return act;
		}
	}
	
	public  Perception perceives(Environment v) {
		
		Perception p = new Perception(false, false);
		
		if(v.isAgentLocation()) {
			p.setDirty(!(v.isDirtyA()));
			p.setLocation(v.isAgentLocation());
			 return p;
		}
		else {
			p.setDirty(!(v.isDirtyB()));
			p.setLocation(v.isAgentLocation());
			return p;
		}
	}
}

import java.util.Scanner;
public class VacuumWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("isDirtyA:");
		boolean x = in.nextBoolean();
		System.out.println("isDirtyB:");
		boolean y = in.nextBoolean();
		System.out.println("agentLocation:");
		boolean z = in.nextBoolean();
		Environment sala = new Environment(x,y,z);
		Agent wally = new Agent();
		Perception wallysPerception = new Perception();
		wallysPerception = wally.perceives(sala);
		System.out.println("numero de passos:");
		int n = in.nextInt();
		for(int i=n;i>0 ;i--) {
			if(wallysPerception.isDirty()) {
				System.out.println(wally.act(wallysPerception).getName());
				if(wallysPerception.isLocation()) {
					sala.setDirtyA(true);
				}
				else {
					sala.setDirtyB(true);
				}
			}
			else if(wallysPerception.isLocation()) {
				System.out.println(wally.act(wallysPerception).getName());
				sala.setAgentLocation(false);
			}
			else {
				System.out.println(wally.act(wallysPerception).getName());
				sala.setAgentLocation(true);
			}
			wallysPerception = wally.perceives(sala);
		}
	}
}

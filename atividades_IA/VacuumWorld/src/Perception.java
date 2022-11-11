
public class Perception {
	
	private boolean location;
	
	private boolean isDirty;
	
	public Perception() {}
	public Perception(boolean location, boolean isDirty) {
		this.location = location;
		this.isDirty = isDirty;
	}
	public boolean isLocation() {
		return location;
	}
	public void setLocation(boolean location) {
		this.location = location;
	}
	public boolean isDirty() {
		return isDirty;
	}
	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}
	
}

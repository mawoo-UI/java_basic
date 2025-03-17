package Mable.area;

public class Local {
	String name;
	int idx;
	
	public Local() {}


	public String Local(String name,int idx) {
		this.name =name;
		this.idx = idx;
		return null;
	}


	@Override
	public String toString() {
		return " [name=" + name + "]";
	}
	
	
	
}

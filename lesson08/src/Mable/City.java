package Mable.area;

public class City extends Sale.local {
int building;
	
	int[] buillding = new int[5];
	int[] fee = new int[5];

	public City(int colorIdx, String name, int idx,int[] buildcost, int[] fee) {
		super(colorIdx,name,idx);
		this.buillding = buildcost;
		this.fee =fee;
	}

	public int getFee() {
		int cnt = 0;
		int feeResult =fee[cnt++];
		int feeResult =city.fee[cnt++];
		
		int i =building;
		while(i !=0) {
			
		}
		
		
		city.building = 1;
		return 0;
		
		
		
	}
}

package mart;

public class MarMain {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(500);
		while(true){
		
		int input =CommonUtils.nextInt("1.상품 선택 2. 결제하기");
		switch (input) {
			case 1 :
				int i2 = CommonUtils.nextInt("1. Tv 2. 컴퓨터 3. 에어콘");
				switch (i2) {
				case 1:
					buyer.buy(new Tv());
					break;
				case 2 :
					buyer.buy(new Computer());
				break;
				case 3:
					buyer.buy(new AirCon());
				default:
						break;
				}
					
				
			case 2:
				buyer.purchase();
				break;
		}
		break;
		
		
		
		
//		Product p = new Tv();
//		Product p2 = new Computer()
//				Product p3 = new 
//		System.out.println(p);
		
	}
}
}
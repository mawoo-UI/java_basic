package lesson08;

public class Phone {

		String name;
		String color;
		String company;
		
		public	Phone() {}
		
		public Phone(String name, String color, String company) {
			super();
			this.name = name;
			this.color = color;
			this.company = company;
		}
		void call () {
			System.out.println("전화 걸기");
		}
		void receive() {
		System.out.println("전화 받기");
}
		@Override
		public String toString() {
			return getClass().getSimpleName() +  " [name=" + name + ", color=" + color + ", company=" + company + "]";
		}
		

		
}

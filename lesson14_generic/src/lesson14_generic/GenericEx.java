package lesson14_generic;

public class GenericEx {
<<<<<<< HEAD
	public static void main(String[] args) {
		Box<Integer, String, Object> box = new Box<>();
		box.setItem(10);
		
		int result = (Integer)box.getItem();
		System.out.println(result);
	}
}

class Box<T, R, V> {
	private T item;
	
	public T getItem() {
		return item;
	}

	public void setItem(T   item) {
		this.item = item;
	}
}
=======
public static void main(String[] args) {
	Box<Integer , String , Object> box = new Box<>();//제네릭에 맞춰 타입만 써주면됨
	box.setItem(10);
	
	int result = (Integer)box.getItem();
	System.out.println(result);
}
}
class Box<T , R, V>{
	public T item;
		public T getItem() {
		return item;
}
		public void setItem (T item) {
			this.item = item;

		}
		
		
		
		
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f

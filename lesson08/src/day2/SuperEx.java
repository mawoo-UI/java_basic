package day2;

public class SuperEx {
public static void main(String[] args) {
	Child child =new Child();
	child.print();
}
}
class Parent{
	int number = 3;
public Parent(int number) {//바뀌면 수퍼쪽에 숫자 따로 기입해줘야함
	System.out.println("부모 객체 생성");
}
Object m () {
	return null;
}

}
class Child extends Parent {
	int number = 2;
	public Child () {
		super(10);//삭제시 문제생김/자동값생김으로인함
		System.out.println("자식 객체 생성 ");
	}
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}//상속하는것이라서 위에 위에(조상따라감)
}

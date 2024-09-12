package lesson07_oop;

public class MarineMain {
	public static void main(String[] args) {
		Marine marin = new Marine();
				
				Object marine;
				System.out.println(marine.hp);
		
		marine.hp -= 5*6;
		
		System.out.println(marine.hp);
		
		Marine.att++;// 공업
		
		
		
	}
	int add(int a,int b) {
		return a+ b;
	}
	

int c;
int d() {
	return 0;
}//메서드는 ()가들어간다
//리턴키워드 안쓰면 오류뜸
//리턴키워드 안하려 할땐 void 사용

}
//메서드는 함수의 하위 카테고리 /출력 하거나 or 안하거나
//mamber함수: 메서드 //클레스 밑에있음.
//자바에선 클래스 안에서만 활용/함수라는 표현x
//static 파이널시 누워서 표기됨//스테틱 다루려고 위쪽에 사용
//들어갈 수도있고 아닐수도 있는 static(메서드에서도 들어갈 수 있음.)

//접근제한자
//제일 많이 쓰임> 퍼블릭 //프라이빗/지역변수에는 못씀

//변수명 명사로
//메서드는 동사형 사용//명령형으로 사용
//이름을 다르게하거나 서명이 달라야함//호출시 반드시 값이 2개여야함+int or더 작은 기본형
//동사형으로 사용,길이제한은없음 
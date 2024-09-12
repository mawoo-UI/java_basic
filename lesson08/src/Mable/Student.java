package Mable;


public class Student {

	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	
	public Student(int i, String string, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}
	@Override
	//학생예제 > java beans 명세서에 맞게끔 수정
	// field 는 private, method는 public 
	
	
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	
	public this.no =no;
		this.name = name;
		this.kor =kor;
		this.eng =eng;
		this.mat =mat;
		}
	
	//no getter 
	public int getNo() {
		return no;
	}
	//no setter
	
	public void setNO(int no) {
		this.no = no;
	}
	public Staring toString() {
	
	public String toString()
	return String.format(name, null)
	int total() {
		return kor+eng+mat;
	}
	
	double avg() {
		return eng;
		
	}
	
}
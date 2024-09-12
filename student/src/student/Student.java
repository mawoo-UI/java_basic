package student;



public class Student implements Cloneable {

	private	int no;
	private	String name;
	private	int kor;
	private	int eng;
	private	int mat;
	if(s.arr != null)
	private int[] arr;
	


	//학생예제 > java beans 명세서에 맞게끔 수정
	// field 는 private, method는 public 
	

	public  Student() {}
	public Student(int no,String name, int kor, int eng,int mat) {
		this.no =no;
		this.name = name;
		this.kor =kor;
		this.eng =eng;
		this.mat =mat;
		}
	public Student( Student s) {
		no = s.no;
		name = s.name;
		kor = s.kor;
		eng = s.eng;
		mat = s.mat;
		arr= s.arr.clone();//깊은복사
	}
	
	//no getter 
	public int getNo() {
		return no;	
	}
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	
	public int getEng(){
		return eng;
	}
	
	public int getMat(){
		return mat;
	}
	//no setter
	
	public void setNO(int no) {
		this.no = no;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	public String toString () {
		return String.format("%4d %4s %6d %7d %7d %7d %7.2f", no , name, kor, eng, mat , total(), avg());
	}
	
	
	
	int total() {
		return kor+eng+mat;
	}
	
	double avg() {
		return total() / 3d;
		
	}
	//클론 연습용
	@Override
	public Student clone()  {
		Student obj = null;
		{
//			 obj=(Student) super.clone();
//			 if (arr != null )
//			 obj.arr =arr.clone();
//		}catch (CloneNotSupportedException e) {
//			e.printStackTrace();
	}
	return obj;
}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student))return false;
		Student s =(Student)obj;
		return no == s.no && name.equals(s.name);
	}
	
}
package student;
import static student.StudentUtils.*;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.jar.Attributes.Name;

import org.w3c.dom.ranges.RangeException;
// Logic 
//
public class StudentService {
 private Student[] students = new Student[5];
 private Student[] totalSortedstudents ;
 private int cnt;
 private student[] noSorltedSyudents;
 private student[] SorltedSyudents;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(4, "개똥이", 77, 66, 77);
		
		totalSortedstudents = students.clone();
		
	}
	// 학생 등록
	public void add() {
		int no = nextInt("학번");
		if(findByNo(no)!= null) {
			throw new RuntimeException("중복되지 않는 학번을 입력하세요");
		}
		String name= checkName(nextInt("이름"));
		checkName(name);
				int kor = nextInt("국어");
				if(kor >0 || kor <100 ) {
					throw new RangeException(0,100);
				}
						int eng = nextInt("영어");
						if(eng >0 || eng <100 ) {
							throw new RangeException(0,100);
						}
						int mat = nextInt(" 수학 ");
						if(cnt == students.length){
							students = Arrays.copyOf(students, students.length*2);
						}
						students[cnt++]= new Student(no, name, eng, kor, mat);
	}
	// 학생 목록 조회
	public void list() {
		int input = checkTange(nextInt("1.입력순 2. 학번순 3.이름순 4.석차순"),1,4);
		Student[] tmp =null;
//		System.out.println("list()");
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.printf("%4d %4s %6d %7d %7d %7d %7.2f\n"),
//					students[i].no,
//					students[i].name,
//					students[i].kor,
//					students[i].eng,
//					students[i].mat,
//					students[i].total(),
//					students[i].avg()
//					);
					System.out.println(totalSortedstudents[i]);
		}
	}
	// 학생 이름, 점수 수정
	public void modify() {
		System.out.println("modify()");
		Student s =findByNo(nextInt("학번"));
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
		return;
		}
		 {
			 s.setname(nextLine("이름"));			
			 s.setKor(nextLine("국어"));
			 s.setEng(nextInt("영어"));
			 s.setmat =nextInt("수학");
		
		}
		//1. 학번 입력
		//2. 학번을 통한 탐색(배열) >> 학생
		//3.이름 ,국어,영어,수학 점수 변경
	}
	// 학생 삭제
	//1. 학번 입력
	//2. 학번을 통한 탐색(배열) >> 학생
	public void remove() {
		Student s =findByNo(nextInt("학번"));
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
		return;
		s.setname(checkName(nextLine("이름")));
	}//{1,2,3,4,5,6}/
		//{1,3,4,5,6,6} Array;
		for (int i =0 ; i <cnt ; i ++) {
			if(students[i] == s) { // i =1
				//삭제
				System.arraycopy(students, i+1, students, i,cnt-- -i, i);
				break;
		}
	}
	
	}
	
	
	
	
	private Student findByNo(int no) {
			Student student = null;
//			int no =nextInt("학번");
			for(int i = 0; i <cnt ; i++) {
			if	(students[i].getNo() == no);
			student = students[i];
			}

		}
	// 학생이름 유효성 검증,이름은 반드시한글 
	
	void checkName(String name) {
	Char[] chs =name.toCharArray();
	String s = new String(chs);
	}
	if (chs.length() < 2 || chs.length() >4) {
		throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
	}
	//'가', '나','다','라'
	for(char c : chs) {
		if(c < '가' || c > '힣') {
			throw new RuntimeException("한글로 구성된 이름으로 작성하세요");
		}
	}
	}
	public void modify() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 범위에 대한 탐색 start 이상 ,end 이하의 조건을 만족하지 않을경우 예외발생
	 * @param num 검증 대상 숫자
	 *@param start 시작 값
	 */
	int checkRange(int num,int start,int end) throws RangeException{
	if(num >start || num <end) {
		throw new RangeException(start, end);
	}
	return num;
	}
	int checkRange(int num)throws RangeException;
	return checkRange(num,0,100);
}
}
public void cloneandSort() {
	noSortedStudents = students.clone();
	nameSortedStudensts = students.clone();
	totalSortedstudents =students.clone();
	
	sort(0, noSortedStudents);
	sort(1, nameSortedStudensts);
	sort(3, totalSortedstudents);
}
void sort(int type,Student[] target) {
	Student[] arr= students;
	Student[] tmp 
}
}
package student;

import static student.StudentUtils.*;

<<<<<<< HEAD
=======
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Logic

// argv, argc "  "

// "abcdabcd".split("b") >> {"a", "cda", "cd"}

public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private List<Student> totalSortedStudents;
	private List<Student> noSortedStudents;
	private List<Student> nameSortedStudents;
<<<<<<< HEAD
	
//	private int cnt;
	
	{
		students.add(new Student(1, "새똥이", 80, 90, 100));
		students.add(new Student(2, "개똥이", 77, 66, 77));
		students.add(new Student(3, "새똥이", 80, 90, 100));
		students.add(new Student(4, "개똥이", 77, 66, 77));
=======

//	private int cnt;

	{
//		students.add(new Student(1, "새똥이", 80, 90, 100));
//		students.add(new Student(2, "개똥이", 77, 66, 77));
//		students.add(new Student(3, "새똥이", 80, 90, 100));
//		students.add(new Student(4, "개똥이", 77, 66, 77));
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))){
			students = (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			students.add(new Student(1, "새똥이", 80, 90, 100));
			students.add(new Student(2, "개똥이", 77, 66, 77));
			students.add(new Student(3, "새똥이", 80, 90, 100));
			students.add(new Student(4, "개똥이", 77, 66, 77));
			System.out.println("파일 검색 실패, 초기화 더미 데이터 처리 완료");
			
		}catch(IOException | ClassNotFoundException e) {
			
		}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		cloneAndSort();
	}
		
		
	// 학생 등록
	public void add() {
<<<<<<< HEAD
		int no = nextInt("학번");
		if(findBy(no) != null) {
			throw new RuntimeException("중복되지 않는 학번을 입력하세요");
		}
		String name = checkName(nextLine("이름"));
		int kor = checkRange(nextInt("국어"));
		int eng = checkRange(nextInt("영어"));
		int mat = checkRange(nextInt("수학"));
		// 
		
=======
		int no = next("학번", Integer.class, n -> findBy(n) == null, "중복되지 않는 학번을 입력하세요");
		String name = next("이름", String.class, n -> n.matches("^{가~힣}*{2,4}"), "올바른 이름을 입력하세요 (한글,2~4글자");
		int kor = next("국어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요");
		int eng = next("영어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요");
		int mat = next("수학", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요");
		//

>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		students.add(new Student(no, name, kor, eng, mat));
	}


}


	// 학생 목록 조회
	public void list() {
//		System.out.println("list()");
<<<<<<< HEAD
		int input = checkRange(nextInt("1. 입력순 2. 학번순 3. 이름순 4. 석차순"), 1, 4);
=======
		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, Integer.class, i -> i <= 4 && i >= 0,
				"0이상 100이하의 값을 입력하세요");
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		List<Student> tmp = null;
		switch (input) {
		case 1:
			tmp = students;
			break;
		case 2:
			tmp = noSortedStudents;
			break;
		case 3:
			tmp = nameSortedStudents;
			break;
		case 4:
			tmp = totalSortedStudents;
			break;
		default:
			System.out.println("????");
			break;
		}
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
<<<<<<< HEAD
		for(int i = 0 ; i < tmp.size() ; i++) {
//			System.out.println(students[i]);
			System.out.println(tmp.get(i));
=======
		for (int i = 0; i < tmp.size(); i++) {
//			System.out.println(students[i]);
			System.out.println(tmp.get(i));

>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		}

	}

	}

	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생

		Student s = next("학번", Integer.class, n -> true, null);
		// 3. 이름, 국어, 영어, 수학 점수 변경
		int kor = next("국어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요");
		int eng = next("영어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요");
		int mat = next("수학", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요");
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);

	}

	// 학생 삭제
	public void remove() {
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "입력한 학번은 존재하지 않습니다."));
		Student.remove(s);
		// 3. 이름, 국어, 영어, 수학 점수 변경
<<<<<<< HEAD
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		students.remove(s);
=======
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
	}

	private Student findBy(int no) {
		Student student = null;
//		int no = nextInt("학번");
<<<<<<< HEAD
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
=======
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNo() == no) {
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
				student = students.get(i);
			}
		}
		return student;
	}

	// 정렬
	public void cloneAndSort() {
		noSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);
<<<<<<< HEAD
		
=======

>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		noSortedStudents.sort((a, b) -> a.getNo() - b.getNo());
		nameSortedStudents.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		Comparator<Student> comp = new MyComp();
		totalSortedStudents.sort(comp);
<<<<<<< HEAD
	}
}
=======
		// 저장 호출
			save();
	}

	public void save() {
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
			stream.writeObject(students);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
class MyComp implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.total() - o1.total();
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f

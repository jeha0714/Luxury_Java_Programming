package Chapter07;

import java.util.*;

class Student {
	
	String name;
	String lec;
	String grade;
	String averageOfGrade;
	
	
	public Student(String name, String lec, String grade, String averageOfGrade) {
		this.name = name;
		this.lec = lec;
		this.grade = grade;
		this.averageOfGrade = averageOfGrade;
	}

	
	String returnName () {
		return name;
	}
	
	
}


public class Chapter07_05 {

	public static void main(String[] args) {
		
		ArrayList<Student> arList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		for (int i = 0; i < 4 ; i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			
			StringTokenizer change = new StringTokenizer(text, ",");
			
			String name = change.nextToken().trim();
			String lec = change.nextToken().trim();
			String grade = change.nextToken().trim();
			String averageOfGrade = change.nextToken().trim();
			
			arList.add(new Student(name, lec, grade, averageOfGrade));
		}
		
		System.out.println("-------------------");
		
		Iterator <Student> it = arList.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			
			System.out.println("이름:" + student.name);
			System.out.println("학과:" + student.lec);
			System.out.println("학번:" + student.grade);
			System.out.println("학점평균:" + student.averageOfGrade);
			System.out.println("-------------------");
		}
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String sayWhat = sc.next();
			if (sayWhat.equals("그만")) 
				break;
			
			Iterator<Student> how = arList.iterator();
			
			while (how.hasNext()) {
				Student chooseStudent = how.next();
				if(chooseStudent.returnName().equals(sayWhat)) {
					System.out.println(chooseStudent.name + ", " + chooseStudent.lec + ", " + chooseStudent.grade + ", " + chooseStudent.averageOfGrade);
					break;
				}
			}
			
			
		}
		
		sc.close();

	}

}

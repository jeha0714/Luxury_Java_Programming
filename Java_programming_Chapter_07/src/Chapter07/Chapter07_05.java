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
		
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
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
			
			System.out.println("�̸�:" + student.name);
			System.out.println("�а�:" + student.lec);
			System.out.println("�й�:" + student.grade);
			System.out.println("�������:" + student.averageOfGrade);
			System.out.println("-------------------");
		}
		
		while(true) {
			System.out.print("�л� �̸� >> ");
			String sayWhat = sc.next();
			if (sayWhat.equals("�׸�")) 
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

package Chapter07;

import java.util.*;

class Students {
	String lec;
	String grade;
	String averageOfGrade;
	
	public Students (String lec , String grade, String averageOfGrade) {
		this.lec= lec;
		this.grade = grade;
		this.averageOfGrade = averageOfGrade;
	}
}


public class Chapter07_05_2 {

	public static void main(String[] args) {
		
		HashMap<String, Students> maps = new HashMap<String, Students>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0; i <4 ; i++) {
			System.out.print(">> ");
			
			String sayWhat = sc.nextLine();
			StringTokenizer distinct = new StringTokenizer(sayWhat, ",");
			
			String name = distinct.nextToken().trim();
			String lec = distinct.nextToken().trim();
			String grade = distinct.nextToken().trim();
			String averageOfGrade = distinct.nextToken().trim();
			
			maps.put(name, new Students(lec, grade, averageOfGrade));
			
		}
		System.out.println("------------------------");
		
		
		Set<String> sayKey = maps.keySet();
		Iterator <String> Key = sayKey.iterator();
		
		while(Key.hasNext()) {
			
			String showKey = Key.next();
			Students sayStudent = maps.get(showKey);
			
			System.out.println(showKey);
			System.out.println(sayStudent.lec);
			System.out.println(sayStudent.grade);
			System.out.println(sayStudent.averageOfGrade);
			
			
			System.out.println("------------------------");
		}
		
		while(true) {
			
			System.out.print("학생 이름 >> ");
			String sayName = sc.next();
			if(sayName.equals("그만"))
				break;
			
			if(maps.containsKey(sayName)) {
				Students newSt = maps.get(sayName);
				
				System.out.println(sayName + ", " + newSt.lec +", " + newSt.grade + ", " + newSt.averageOfGrade);
			}
			
			
		}
		
		
	}

}

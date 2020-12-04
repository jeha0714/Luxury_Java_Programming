package Chapter07;

import java.util.*;

public class Chapter07_07 {

	public static void main(String[] args) {
		
		HashMap<String, Double> maps = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("미래장학금관리시스템입니다.");
		
		for(int i = 0; i< 5 ; i++) {
			System.out.print("이름과 학점>> ");
			String name = sc.next();
			Double score = sc.nextDouble();
			
			maps.put(name, score);
		}
		
		System.out.print("장학생 선발 학점 기준 입력>> ");
		Double minScore = sc.nextDouble();
		
		System.out.print("장학생 명단 : ");
		
		Set<String> setKeys = maps.keySet();
		Iterator <String> Keys = setKeys.iterator();
		
		while(Keys.hasNext()) {
			String showKey = Keys.next();
			
			if(maps.get(showKey) >= minScore) {
				System.out.print(showKey + " ");
			}
		}
		
		
		
	}

}

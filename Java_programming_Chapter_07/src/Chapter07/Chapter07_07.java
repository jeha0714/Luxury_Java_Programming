package Chapter07;

import java.util.*;

public class Chapter07_07 {

	public static void main(String[] args) {
		
		HashMap<String, Double> maps = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		for(int i = 0; i< 5 ; i++) {
			System.out.print("�̸��� ����>> ");
			String name = sc.next();
			Double score = sc.nextDouble();
			
			maps.put(name, score);
		}
		
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		Double minScore = sc.nextDouble();
		
		System.out.print("���л� ��� : ");
		
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

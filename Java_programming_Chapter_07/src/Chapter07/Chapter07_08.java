package Chapter07;

import java.util.*;

public class Chapter07_08 {

	public static void main(String[] args) {
			
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = sc.next();
			if(name.equals("�׸�"))
				break;
			
			int point = sc.nextInt();
			
			if (maps.containsKey(name)) {
				int sumAll = maps.get(name);
				maps.remove(name);
				maps.put(name, sumAll + point);
			}
			else
				maps.put(name, point);
			
			
			Set<String> setkeys = maps.keySet();
			Iterator <String> Keys = setkeys.iterator();
			
			while(Keys.hasNext()) {
				String showKey = Keys.next();
				
				System.out.print("(" + showKey + "," + maps.get(showKey) + ")");
			}
			System.out.println("");
			
			
			
			
		}
		

	}

}

package Chapter07;

import java.util.*;

public class Chapter07_03 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap <String, Integer> nations = new HashMap<String, Integer>();
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String country = sc.next();
			
			if (country.equals("그만"))
				break;
			
			int numPpl = sc.nextInt();
			
			nations.put(country, numPpl);
			
		}
		
		/*Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();*/
		
		while (true) {
			System.out.print("인구 검색 >> ");
			String sayCountry = sc.next();
			
			if (sayCountry.equals("그만"))
				break;
			
			if (nations.containsKey(sayCountry) == true)
				System.out.println(sayCountry + "의 인구는 " + nations.get(sayCountry));
			else
				System.out.println(sayCountry + "나라는 없습니다.");
			
		}
		
		sc.close();
	}
}

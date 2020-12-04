package Chapter07;

import java.util.*;

public class Chapter07_03 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap <String, Integer> nations = new HashMap<String, Integer>();
		
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String country = sc.next();
			
			if (country.equals("�׸�"))
				break;
			
			int numPpl = sc.nextInt();
			
			nations.put(country, numPpl);
			
		}
		
		/*Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();*/
		
		while (true) {
			System.out.print("�α� �˻� >> ");
			String sayCountry = sc.next();
			
			if (sayCountry.equals("�׸�"))
				break;
			
			if (nations.containsKey(sayCountry) == true)
				System.out.println(sayCountry + "�� �α��� " + nations.get(sayCountry));
			else
				System.out.println(sayCountry + "����� �����ϴ�.");
			
		}
		
		sc.close();
	}
}

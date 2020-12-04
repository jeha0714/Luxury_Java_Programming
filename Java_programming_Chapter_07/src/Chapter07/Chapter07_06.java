package Chapter07;

import java.util.*;

class Location {
	String longitude;
	String latitude;
	
	public Location (String longitude, String latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
}


public class Chapter07_06 {

	public static void main(String[] args) {
		
		HashMap <String, Location> maps = new HashMap<String, Location>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("도시,경도,위도를 입력하세요.");
		for (int i = 0; i <4 ; i++) {
			System.out.print(">>" );
			
			String text = sc.nextLine();
			StringTokenizer distinct = new StringTokenizer(text, ",");
			
			String city = distinct.nextToken().trim();
			String longitude = distinct.nextToken().trim();
			String latitude = distinct.nextToken().trim();
			
			maps.put(city, new Location(longitude, latitude));
		}
		System.out.println("-----------------------");
		
		Set<String> setKey = maps.keySet();
		Iterator <String> Keys = setKey.iterator();
		
		while(Keys.hasNext()) {
			String city = Keys.next();
			
			Location location = maps.get(city);
			
			System.out.println(city + " " + location.longitude + " " + location.latitude);
			
		}
		System.out.println("-----------------------");
		
		
		while(true) {
			System.out.print("도시 이름 >> ");
			String sayCity = sc.next();
			
			if(maps.containsKey(sayCity)) {
				Location location = maps.get(sayCity);
				System.out.println(sayCity + " " + location.longitude + " " + location.latitude);
				}
			else
				System.out.println(sayCity + "는 없습니다.");
		}
		
		
		
	}

}

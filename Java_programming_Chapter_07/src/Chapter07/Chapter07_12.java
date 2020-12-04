package Chapter07;

import java.util.*;

class fk<T1, T2> extends HashMap<T1, T2>{
	
	
}


public class Chapter07_12 {

	public static void main(String[] args) {
		
		HashMap <String, String> maps = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		maps.put("eye", "눈");
		maps.put("human", "인간");
		maps.put("fault", "오류");
		maps.put("emotion", "감정");
		maps.put("painting", "그림");
		maps.put("animal", "동물");
		maps.put("longitude", "경도");
		maps.put("latitude", "위도");
		maps.put("earth", "지구");
		maps.put("korea", "한국");
		maps.put("library", "도서관");
		maps.put("java", "자바");
		maps.put("GF", "여친");
		maps.put("BF", "남친");
		maps.put("trade", "거래");
		maps.put("social", "사회");
		maps.put("future", "미래");
		
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		
		while(true) {
			
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			int chooseNum = sc.nextInt();
			
			if (chooseNum == 1) {
				System.out.println("현제 " + maps.size() + "개의 단어가 들어있습니다. -1을 입력하면 테스트를 종료합니다.");
				
				while(true) {
					Set<String> keyOfMaps = maps.keySet();
					Vector<String> keyOfVec = new Vector<String>();
					keyOfVec.addAll(keyOfMaps);
					
					int num1 = (int) (Math.random()*keyOfVec.size());
					int num2 = (int)(Math.random()*keyOfVec.size());
					int num3 = (int)(Math.random()*keyOfVec.size());
					int num4 = (int)(Math.random()*keyOfVec.size());
					
					int ProblemNum = (int) (Math.random() * keyOfVec.size()); //문제 영어ver
					int chooseR = (int) (Math.random()*4);
					if (chooseR == 1)
						num1 = ProblemNum;
					else if (chooseR == 2)
						num2 = ProblemNum;
					else if (chooseR == 3)
						num3 = ProblemNum;
					else
						num4 = ProblemNum;
					
					System.out.println(keyOfVec.get(ProblemNum) + "?");
					System.out.print("(1)" + maps.get(keyOfVec.get(num1)) + " (2)" + maps.get(keyOfVec.get(num2)) + " (3)" + maps.get(keyOfVec.get(num3)) +" (4)" + maps.get(keyOfVec.get(num4)) + ":>");
					
					int koreanAnswer = sc.nextInt();
					if (koreanAnswer == (-1))
						break;
					if (koreanAnswer == 1)
						koreanAnswer = num1;
					else if (koreanAnswer == 2)
						koreanAnswer = num2;
					else if (koreanAnswer == 3)
						koreanAnswer = num3;
					else
						koreanAnswer = num4;
					
					if(maps.get(keyOfVec.get(ProblemNum)).equals(maps.get(keyOfVec.get(koreanAnswer)))) 
						System.out.println("Excellent !!");
					else
						System.out.println("No. !!");
				}
				
			}
			
			else if (chooseNum == 2) {
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				
				while(true) {
					System.out.print("영어 한글 입력 >> ");
					String english = sc.next();
					
					if (english.equals("그만"))
						break;
					
					String korean = sc.next();
					
					maps.put(english, korean);
				}
			}
			
			else if (chooseNum == 3) {
				System.out.println("\"명품영어\"를 종료합니다.");
				break;
			}
			else 
				System.out.println("번호를 잘 못 선택하셨습니다. 다시 선택해주세요.");			
			
		}

	}

}

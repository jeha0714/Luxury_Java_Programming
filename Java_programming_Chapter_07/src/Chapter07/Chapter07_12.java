package Chapter07;

import java.util.*;

class fk<T1, T2> extends HashMap<T1, T2>{
	
	
}


public class Chapter07_12 {

	public static void main(String[] args) {
		
		HashMap <String, String> maps = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		maps.put("eye", "��");
		maps.put("human", "�ΰ�");
		maps.put("fault", "����");
		maps.put("emotion", "����");
		maps.put("painting", "�׸�");
		maps.put("animal", "����");
		maps.put("longitude", "�浵");
		maps.put("latitude", "����");
		maps.put("earth", "����");
		maps.put("korea", "�ѱ�");
		maps.put("library", "������");
		maps.put("java", "�ڹ�");
		maps.put("GF", "��ģ");
		maps.put("BF", "��ģ");
		maps.put("trade", "�ŷ�");
		maps.put("social", "��ȸ");
		maps.put("future", "�̷�");
		
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�. ****");
		
		while(true) {
			
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>> ");
			int chooseNum = sc.nextInt();
			
			if (chooseNum == 1) {
				System.out.println("���� " + maps.size() + "���� �ܾ ����ֽ��ϴ�. -1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
				
				while(true) {
					Set<String> keyOfMaps = maps.keySet();
					Vector<String> keyOfVec = new Vector<String>();
					keyOfVec.addAll(keyOfMaps);
					
					int num1 = (int) (Math.random()*keyOfVec.size());
					int num2 = (int)(Math.random()*keyOfVec.size());
					int num3 = (int)(Math.random()*keyOfVec.size());
					int num4 = (int)(Math.random()*keyOfVec.size());
					
					int ProblemNum = (int) (Math.random() * keyOfVec.size()); //���� ����ver
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
				System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
				
				while(true) {
					System.out.print("���� �ѱ� �Է� >> ");
					String english = sc.next();
					
					if (english.equals("�׸�"))
						break;
					
					String korean = sc.next();
					
					maps.put(english, korean);
				}
			}
			
			else if (chooseNum == 3) {
				System.out.println("\"��ǰ����\"�� �����մϴ�.");
				break;
			}
			else 
				System.out.println("��ȣ�� �� �� �����ϼ̽��ϴ�. �ٽ� �������ּ���.");			
			
		}

	}

}

package Chapter07;

import java.util.*;

abstract class Shape {
	public Shape() {}
	public void paint() {draw();}
	abstract public void draw();
}

class Line extends Shape {
	
	public String Line() {
		return "Line";
	}
	
	
	public void draw() {
		
		
	}
	
	public String toString() {
		return "Line";
	}
}

class Rect extends Shape {

	public String Rect() {
		return "Line";
	}
	
	public void draw() {
		
		
	}
	
	public String toString() {
		return "Rect";
	}
}
class Circle extends Shape {
	
	public String Circle() {
		return "Line";
	}
	
	public void draw() {
		
		
	}
	
	public String toString() {
		return "Circle";
	}
}


public class Chapter07_10 {

	public static void main(String[] args) {
		
		Vector<Shape> v = new Vector<Shape>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int sayCode = sc.nextInt();
			
			if(sayCode == 1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int sayWhat = sc.nextInt();
				
				if (sayWhat == 1) {
					v.add(new Line());
				}
				else if (sayWhat == 2) {
					v.add(new Rect());
				}
				else if (sayWhat == 3) {
					v.add(new Circle());
				}
				else
					System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				
				
			}
			
			else if (sayCode == 2) {
				System.out.print("������ ������ ��ġ>>");
				int delLocation = sc.nextInt();
				
				if(v.size() >= delLocation + 1 ) {
					v.remove(delLocation);
				}
				else
					System.out.println("������ �� �����ϴ�.");
			}
			
			else if (sayCode == 3) {
				
				Iterator it = v.iterator();
				while(it.hasNext()) {
					System.out.println(it.next().toString());
				}
				
			}
			
			else if (sayCode == 4) {
				break;
			}
			
			else
				System.out.println("1~4�� ���� ������ȣ�� �Է����ּ���.");
			
		}
		
		System.out.println("beauty�� �����մϴ�.");
		
		
	}

}

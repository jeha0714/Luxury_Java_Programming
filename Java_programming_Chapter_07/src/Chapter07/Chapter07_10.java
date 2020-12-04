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
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
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
					System.out.println("번호를 다시 입력해주세요.");
				
				
			}
			
			else if (sayCode == 2) {
				System.out.print("삭제할 도형의 위치>>");
				int delLocation = sc.nextInt();
				
				if(v.size() >= delLocation + 1 ) {
					v.remove(delLocation);
				}
				else
					System.out.println("삭제할 수 없습니다.");
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
				System.out.println("1~4번 내의 정수번호를 입력해주세요.");
			
		}
		
		System.out.println("beauty을 종료합니다.");
		
		
	}

}

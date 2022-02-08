package shapes;

import java.util.Scanner;

public class Square extends Quadrilateral {
	
	int area;
	
	public Square(Integer base, Integer height) {
		super(base, height);
	
	}
	
	public void area() {
		
		Scanner s= new Scanner(System.in);
		setBase(s.nextInt());
		setHeight(s.nextInt());
		area=getBase()*getHeight();
		System.out.println("The area of Square is: "+ area);
		s.close();
		
	}

}

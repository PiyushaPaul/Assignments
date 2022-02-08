package shapes;

import java.util.Scanner;

public class Parallelogram extends Quadrilateral {
	
	int area;
	

	public Parallelogram(Integer base, Integer height) {
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

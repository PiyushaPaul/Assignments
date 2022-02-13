package shapes;


public class Rectangle extends Quadrilateral {
	
	int area;
	

	
	//public Rectangle(Integer base, Integer height) {
		//super(base,height);
	
	//}
	
	public void area() {
		
		
		
		setBase(10);
		setHeight(5);
		area=getBase()*getHeight();
		System.out.println("The area of Rectangle is: "+ area);
	
		
	}

		
}



package shapes;


public class Square extends Quadrilateral {
	
	int area;
	
	//public Square(Integer base, Integer height) {
		//super(base, height);
	
	//}
	
	public void area() {
		
		setBase(10);
		setHeight(10);
		area=getBase()*getHeight();
		System.out.println("The area of square is: "+ area);
		
	}

}

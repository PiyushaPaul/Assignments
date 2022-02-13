package shapes;


public class Parallelogram extends Quadrilateral {
	
	int area;
	

	//public Parallelogram(Integer base, Integer height) {
		//super(base, height);
	
	//}
	
	public void area() {
		
		setBase(10);
		setHeight(5);
		area=getBase()*getHeight();
		System.out.println("The area of Parallelogam is: "+ area);
		
	}

	


}

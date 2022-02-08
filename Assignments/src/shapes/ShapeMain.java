package shapes;

public class ShapeMain {

	public static void main(String[] args) {
		
		Rectangle rectangle= new Rectangle(10,8);
		Square square= new Square(10,10);
		Parallelogram parallelogram = new Parallelogram(10,6);
		
		rectangle.area();
		square.area();
		parallelogram.area();
		

	}

}

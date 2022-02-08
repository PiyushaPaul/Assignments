package shapes;

public abstract class Quadrilateral {

	private Integer base;
	private Integer height;
	
	public Integer getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
	
	abstract public void area();
	
	
	public Quadrilateral() {
	}
	
	public Quadrilateral(Integer base, Integer height) {
		this.base = base;
		this.height = height;
	}
	
	
	
}

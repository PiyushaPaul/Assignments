package searchabstract;

public abstract class AbstractSearch {
	
	private int intarr[]=new int[4];
	private String strarr[]=new String[4];
	private int it;
	private String str;
	
	
	public int[] getIntarr() {
		return intarr;
	}
	public void setIntarr(int[] intarr) {
		this.intarr = intarr;
	}
	public String[] getStrarr() {
		return strarr;
	}
	public void setStrarr(String[] strarr) {
		this.strarr = strarr;
	}
	
	
	
	public int getIt() {
		return it;
	}
	public void setIt(int it) {
		this.it = it;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
	
	public AbstractSearch(int[] intarr, String[] strarr, int it, String str) {
		this.intarr = intarr;
		this.strarr = strarr;
		this.it = it;
		this.str = str;
	}
	
	public AbstractSearch() {
		
	}
	
	abstract public void booleanSearch();
	
	
	
	

}

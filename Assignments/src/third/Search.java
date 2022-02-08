package third;

public class Search {
	public static void main(String[] args) {
		Integer[] intObjs= {1,2,3,4,5,6};
		String[] strObj= {"abc","def","ghi","jkl"};
		
		IntegerSearch intSearch= new IntegerSearch();
		if(intSearch.search(intObjs,2)) {
			System.out.println("Item Found");
		}else
			System.out.println("Item Not Found");
		
		StringSearch strSearch=new StringSearch();
		if(strSearch.search(strObj, "abc")) {
			System.out.println("Item Found");
		}else 
			System.out.println("Item Found");
			
		
	}

}

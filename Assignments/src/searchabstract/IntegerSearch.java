package searchabstract;

public class IntegerSearch extends AbstractSearch{

	@Override
	public void booleanSearch() {
		
		int arr[]= {2,3,4,5};
		setIntarr(arr);
		
		setIt(4);
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==getIt()) {
				System.out.println("Integer Found at "+ i);
			}
			else {
				System.out.println("Integer Not Found");
			}
		}
		
		
	}
	
	
	
	

}

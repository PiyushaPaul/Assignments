package searchabstract;

public class StringSearch extends AbstractSearch {

	@Override
	public void booleanSearch() {
		
		String strr[]= {"piyu","krish","rimi","polo"};
		setStrarr(strr);
		
		setStr("shona");
		
		for(int i=0;i<strr.length;i++) {
			if(strr[i]==getStr()) {
				System.out.println("String Found at "+i);
			}
			else {
				System.out.println("String Not Found");
			}
	}
	}
	
	

}

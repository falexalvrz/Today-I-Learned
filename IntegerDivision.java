package reasoning;

public class IntegerDivision {
	
	/** OLD CODE WITH ASSERTIONS AS AFTERTHOUGHTS**
	 * int intDiv (int m, int n) { 
		int x=m; 
		int y=0; 
		while (x>=n) {
			x = x-n; 
			y=y+1;
			assert y*n+x == m;
		}
		assert x<n;
		return y;
	}
	*/
	/** NEW CODE WITH ASSERTIONS TAKEN INTO ACCOUNT*/
	int assertDiv(int m, int n) {
		int x=m;
		int y=0;
		while (x>=n) {
			y=y+1;
			x=x-n;
			assert y*n+x == m;
		}
		assert x<n;
		return y;
	}

}


public class Quadratic {
	private int a; private int b; private int c;
	
	protected Quadratic(int aValue, int bValue, int cValue) {
		a = aValue;
		b = bValue;
		c = cValue;
	}
	
	// 2 values are always returned unless discriminant is 0
	protected int[] solve() {
		int[] returnStatement = new int[2];
		if(Math.sqrt(a*a - 4*a*c) % 1 == 0) {
			
		}
		return returnStatement;
	}
}

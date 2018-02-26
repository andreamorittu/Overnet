
public class LargestDiv {

	public static void main(String[] args) {
		int n=(int)(Math.random()*100);
		System.out.println(n);
		int divisor=0;
		for(int i=1; i<n; i++) {
			if(n%i==0)
				divisor=i;
		}
		System.out.println(divisor);
	}

}

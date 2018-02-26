
public class PrintPatternB {

	public static void main(String[] args) {
		int length =10;
		for(int i=length; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("#  ");
			}
			System.out.println();
		}
	}

}

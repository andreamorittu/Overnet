
public class ExtractDigits {

	public static void main(String[] args) {
		int n=12345;
		while(n>0) {
			int temp=n%10;
			System.out.print(temp);
			System.out.print("  ");
			n=n/10;
		}
	}

}

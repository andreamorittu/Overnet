
public class PrimeNum {

	public static void main(String[] args) {
		boolean isPrime;
		for(int i=0; i<=100; i++) {
			isPrime=true;
			for(int j=2; j<i; j++) {
				if(i%j==0)
					isPrime=false;
			}
			if(isPrime)
				System.out.println(i);
		}
	}

}

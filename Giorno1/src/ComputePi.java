
public class ComputePi {

	public static void main(String[] args) {
		double sum=0;
		int maxDen=1000000;
		
		for(int den=0; den<=maxDen; den++) {
			if(den % 4==1)
				sum=sum+ (1/den);
				else if(den % 4== 3)
				sum= sum-(1/den);
		}
		
		System.out.println(4*sum);
	}

}

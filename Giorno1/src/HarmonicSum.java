
public class HarmonicSum {

	public static void main(String[] args) {
		int maxDen = 5000;
		double sumL=0;
		double sumR=0;
		
		for(int den=1; den<=maxDen; den++) {
			sumL= den + (1/den);
		}
		System.out.println(sumL);
		
		for(int den=maxDen; den>0; den--) {
			sumR= den + (1/den);
		}
		System.out.println(sumR);
		
		
		
		
			
	}

}


public class SumAndAverageD {

	public static void main(String[] args) {
		int sum=0;
		double average;
		int i=0;
			
			do {
				sum=sum+i;
				i++;
			}while(i<=100);
		
		average=sum/100;
		System.out.println(sum);
		System.out.println(average);
	}
	

}

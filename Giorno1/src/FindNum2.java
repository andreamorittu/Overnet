
public class FindNum2 {

	public static void main(String[] args) {
		double buf, sum=0;
		int max=0, min=0;
		
		System.out.println("I numeri estratti sono:");
		for(int i=0; i<10; i++) {
			double range=(100+100)+1;
			buf=(int)(Math.random()*range)-100;
			System.out.print(buf+" ");
			sum+=buf;
			if(buf>max)
				max=(int)buf;
			if(buf<min)
				min=(int)buf;
		}
		
		
		System.out.println();
		System.out.println("il massimo e': "+max);
		System.out.println("il minimo e': "+min);
		System.out.println("La media è : "+sum/10);
	}

}

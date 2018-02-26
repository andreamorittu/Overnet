
public class FindNum {

	public static void main(String[] args) {
		int buf, max=0;
		System.out.println("I numeri estratti sono:");
		for(int i=0; i<10; i++) {
			buf=(int)(Math.random()* -100);
			System.out.print(buf+" ");
			if(buf<max)
				max=buf;
			
		}
		System.out.println();
		System.out.println("il massimo e': "+max);
	}

}

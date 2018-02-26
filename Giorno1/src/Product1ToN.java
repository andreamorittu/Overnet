
public class Product1ToN {

	public static void main(String[] args) {
		int product =10;
		int length=product;
		int i=1;
		
		do {
			product=product * i;
			i++;
		}while(i<length);
		
		System.out.println(product);
	}

}


public class CozaLozaWoza {

	public static void main(String[] args) {
		for(int i=1; i<=110; i++) {
			if(i%3==0 && i%7!=0 && i%5!=0) {
				System.out.print("Coza");
				System.out.print("  ");
				if(i%11==0) {
					System.out.print(i);
					System.out.println();
				}
			}
			else if(i%5==0 && i%7!=0 && i%3!=0) {
				System.out.print("Loza");
				System.out.print("  ");
				if(i%11==0) {
					System.out.print(i);
					System.out.println();
				}
			}
			else if(i%7==0 && i%5!=0 && i%3!=0 ) {
				System.out.print("Woza");
				System.out.print("  ");
				if(i%11==0) {
					System.out.print(i);
					System.out.println();
				}
			}
			else if(i%3==0 && i%5==0) {
				System.out.print("CozaLoza");
				System.out.print("  ");
				if(i%11==0) {
					System.out.print(i);
					System.out.println();
				}
			}
			else if(i%3==0 && i%7==0) {
				System.out.print("CozaWoza");
				System.out.print("  ");
				if(i%11==0) {
					System.out.print(i);
					System.out.println();
				}
			}
			else if(i%5==0 && i%7==0) {
				System.out.print("LozaWoza");
				System.out.print("  ");
				if(i%11==0) {
					System.out.print(i);
					System.out.println();
				}
			}
			else if(i%11==0) {
				System.out.print(i);
				System.out.println();
			}
			else {
				System.out.print(i);
				System.out.print("  ");
			}
				
		}
		
	}

}

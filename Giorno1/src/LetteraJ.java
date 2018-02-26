
public class LetteraJ {

	public static void main(String[] args) {
		
		int riga = 5;
		int colonna = 5;
		
	    for (int i=0; i <=riga; i++) {
            for (int j=0 ; j<=2*colonna- i; j++) {
              
            	if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

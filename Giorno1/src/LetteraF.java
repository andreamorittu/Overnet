
public class LetteraF {

	public static void main(String[] args) {
		
		int riga = 20;
		int colonna = 20;
		for (int i=0; i < riga; i++) {
            for (int j=0; j<colonna; j++) {
            	if(i==0 || i== riga-1) { //CONDIZIONE CHE MI CREA LA RIGA!
            		System.out.print("# ");
            	}
            	else 
            		if(i==j) { //CONDIZIONE CHE MI CREA LA COLONNA!
            			System.out.print("# "); 
            		}
            		else {
            			System.out.print("  ");	//NB. CONTARE GLI SPAZI!!!!!!!!!
                	}
            }
            System.out.println();    
		}
		
	}
		
}
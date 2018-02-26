
public class LetteraH {

	public static void main(String[] args) {
		
		int riga = 9;
		int colonna = 9;
		for (int i=0; i < riga; i++) {
            for (int j=0; j<colonna; j++) {
            	if(i==0 || i== riga-1) { //CONDIZIONE CHE MI CREA LA RIGA!
            		System.out.print("# ");
            	}
            	else 
            		if(i+j== colonna-1 || i==j) { //CONDIZIONE CHE MI CREA LA COLONNA!
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
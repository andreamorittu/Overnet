
public class VowCount {

	public static void main(String[] args) {
		
		String vow= "aeiou";
		String s= "nicolociaraldi92";
		int numVoc=0, numNum=0;
		
		
		for(int i=0; i<s.length(); i++) {
			Character temp= s.charAt(i);
			if(Character.isDigit(temp))
				numNum++;
			else {
				for(int j=0;j<vow.length();j++) {
					if(s.charAt(i)==vow.charAt(j))
						numVoc++;
				}
			}
		
		}
	
		int numCons= (s.length()-numVoc-numNum);
		System.out.println("Vocali: " +numVoc);
		System.out.println("Consonanti: " +numCons);
		System.out.println("Numeri: " +numNum);
	

	}	
}


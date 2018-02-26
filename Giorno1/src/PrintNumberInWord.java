
public class PrintNumberInWord {

	public static void main(String[] args) {
		int number=10;
		
		if (number == 1)
			System.out.println("One");
		else if(number==2)
			System.out.println("Two");
		else if(number==3)
			System.out.println("Tre");
		else if(number==4)
			System.out.println("Quattro");
		else if(number==5)
			System.out.println("Cinque");
		else if(number==6)
			System.out.println("Sei");
		else if(number==7)
			System.out.println("Sette");
		else if(number==8)
			System.out.println("Otto");
		else if(number==9)
			System.out.println("Nove");
		else
			System.out.println("OTHER");
		
		
		
		switch(number) {
		case 1: System.out.println("One"); break;
		case 2: System.out.println("Two"); break;
		case 3: System.out.println("Tre"); break;
		case 4: System.out.println("Quattro"); break;
		case 5: System.out.println("Cinque"); break;
		case 6: System.out.println("Sei"); break;
		case 7: System.out.println("Sette"); break;
		case 8: System.out.println("Otto"); break;
		case 9: System.out.println("Nove"); break;
		default: System.out.println("Other"); break;		
		}
	}

}

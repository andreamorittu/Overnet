
public class EightAndTree {

	public static void main(String[] args) {
		Integer buf;
		int numO=0, numT=0;
		
		System.out.println("I numeri estratti sono");
		for(int i=0; i<10; i++) {
			double range= (800+200)+1;
			buf = (int)(Math.random()*range)-200;
			System.out.print(buf+" ");
			
			String temp= buf.toString();
			for(int j=0; j<temp.length(); j++) {
				if(temp.charAt(j)=='3') 
					numT++;
				else if(temp.charAt(j)=='8')
					numO++;
			}
		}
		System.out.println();
		System.out.println("OTTO: "+numO+" TRE: "+numT);
		if((numO+numT)>20)
			System.out.println("Success!");
		else
			System.out.println("Fail!");
	}

}

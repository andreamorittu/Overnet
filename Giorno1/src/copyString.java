

public class copyString {

	public static void main(String[] args) {
		StringBuilder s= new StringBuilder("secchiodigomma");
		System.out.println("La stringa era: " +s);
		System.out.println("La stringa e': " +s.reverse());
		
		StringBuilder a= new StringBuilder("nicolociaraldi");
		String x="";
		StringBuilder res= a.replace(0, 1, x);
		res.replace(8, a.length(), x);
		System.out.println("La stringa era: " +a);
		System.out.println("Invertita: " +res.reverse());
		
	}

}

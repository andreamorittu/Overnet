
public class CLW {
	
	static class ArrEs{
		int[] intArr= {3,4,10,100,48000,17};
		
		void es1() {
			System.out.println("Hello");
		}
		
		void es2() {
			for(int x=0; x<intArr.length; x++) {
				System.out.println(x + ": " + intArr[x]);
			}
			System.out.println("End of method and return");
			return;
		}
		
		void es3() {
			for (int val: intArr) {
				System.out.println(val);
			}
			System.out.println("End of method and return");
			return;
		}
		
		void setAllZero() {
			for(int i=0; i<intArr.length; i++) {
				intArr[i]=0;
			}
		}
		
		public ArrEs() {
		es2();
		setAllZero();
		es2();
		}
		
		public ArrEs(String val) {
			System.out.println(val);
		}
	}
	
	static class MathArr {


		int[] buff;
		
		public MathArr() {
			int[] b= {3,4,56,7,88,8,92,2,10};
			buff=b;
		}
		
		public int getSum() {
			int sum=0;
			for(int i=0; i<buff.length; i++) {
				sum+=buff[i];
			}
			return sum;
		}
		
		public double getAvg() {
			double avg=0;
			int sum=0;
			for(int i=0; i<buff.length; i++) {
				sum+=buff[i];
			}
			avg=sum/buff.length;
			return avg;
		}
		
		public boolean thereIsNegVal() {
			for(int i=0; i<buff.length; i++) {
				if(buff[i]<0)
					return true;
		}
			return false;
	}
		
		public void reverseArr() {
			int[] temp=new int[buff.length];
			for(int i=0; i<buff.length; i++) {
				temp[buff.length-1-i]=buff[i];
			}
			buff=temp;
		}
		
		public void Stampa() {
			for(int i =0; i<buff.length;i++) {
				System.out.print(buff[i]+" ");
			}
		}
	}
	
	static class ArrayManipulation{
		
		public static Integer getMax(int[] arr) {
			Integer temp=new Integer(0);
			if(arr==null)
				return null;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>temp)
					temp=arr[i];
			}
			return temp;
		}
		
		public static Integer findElem(int[] arr, int elem) {
			Integer temp= new Integer(-1);
			if(arr==null)
				return null;
			for(int i=0; i<arr.length; i++) {
				if(i==elem)
					return temp;
			}
			return temp;
		}
		
		public static int[] conc(int[] ar1, int[] ar2) {
			int[] res=new int [ar1.length+ar2.length];
			for(int i=0; i<ar1.length; i++) {
				res[i]=ar1[i];
			}
			for(int j=ar1.length, k=0; j<res.length; j++, k++) {
				res[j]=ar2[k];
			}
			return res;
		}
		
		public static void Stampa(int[] a) {
			for(int i =0; i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
/*		MathArr es= new MathArr();
		System.out.println("Il primo Array");
		es.Stampa();
		System.out.println("");
		System.out.println("La somma");
		System.out.println(es.getSum());
		System.out.println("la media");
		System.out.println(es.getAvg());
		System.out.println("Neg val");
		System.out.println(es.thereIsNegVal());
		System.out.println("Reverse");
		es.reverseArr();
		es.Stampa();*/
		
		
		System.out.println("Il primo array è");
		System.out.println("");
		int[] a= {1,2,3,4,5};
		ArrayManipulation.Stampa(a);
		System.out.println("Il secondo array è");
		System.out.println("");
		int[] b= {6,7,8,9,10};
		ArrayManipulation.Stampa(b);
		System.out.println("");System.out.println("Concateno");
		int[] es2= ArrayManipulation.conc(a, b);
		for(int i =0; i<es2.length;i++) {
			System.out.print(es2[i]+" ");
		}
 	}

}


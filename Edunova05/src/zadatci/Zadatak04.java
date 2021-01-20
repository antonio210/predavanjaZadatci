package edonova.zadatci;

public class Zadatak04 {

	public static void main(String[] args) {
		
		int[] niz= {2,5,5};
		System.out.println(suma(niz,1));
	}
	
	public static int suma(int[] niz1) {
		int rez = 0;
		for(int i =0;i<niz1.length;i++)
			rez+=niz1[i];
		return rez;
	}
	
	public static int suma(int[] niz1,int a) {
		int rez = 0;
		for(int i:niz1) {
			rez+=i;
		}
		return rez;
	}
	
	
	
	
	
}

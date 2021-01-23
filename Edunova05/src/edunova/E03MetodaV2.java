package edunova;



public class E03MetodaV2 {
	
	public static void ispisi(int x, int y) {
		System.out.println(x+ " i "+y);
	}
	
	// method overloading
	
	public static void ispisi(char c) {
		System.out.println(c);
		
	}
	
	public static void ispisi(char c, int i) {
		System.out.print(c);
		System.out.println(i);
	}
	

}

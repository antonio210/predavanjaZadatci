package edunova.zadatak2;

public class Zadatak2 {

	// Kreirajte dvije klase, jedna nasljeđuje drugu.
	// svaka klasa ima minimalno 3 svojstva
	
	
	public static void main(String[] args) {
		
		Automobil volkswagen = new Automobil(1200, 180, 105, 4, 5, "crna");
		
		System.out.println("Automobil ima masu od " + volkswagen.getMasa() + " kilograma");
		
 
	}

}

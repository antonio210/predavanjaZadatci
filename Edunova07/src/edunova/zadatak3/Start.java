package edunova.zadatak3;

public class Start {
	
	// Kreirajte paket zadatak2
	// Kreirajte model klasa koji opisuje svijet flore i faune
	// na minimalno 4 razine nasljeđivanja
	// na svakoj razini nasljeđivanja u klasi definirajte minimalno 2 svojstva
	// Instancijrajte svaku od kreiranih najnižih klasa
	// klase na višoj razini proglasite pastraktnima

	public static void main(String[] args) {
	
		
		
	Mammals bear =  new Mammals(135, 450, true, 4, "both", true,"placetal", true);

	Mammals kangaroo = new Mammals(165, 105, true, 4, "both", false, "marsupial", true);
		
	if(bear.getHeight()<kangaroo.getHeight()) {
		System.out.println("Kangaroo is taller then bear");
	}else {
		System.out.println("Bear is taller then kangaroo");
	}
	}

}

package edunova.zadatak1;

// Kreirajte privatnu unutarnju klasu u ovoj klasi
// koja se zove Dokument i ima 4 svojstva različitih tipova podataka
// definirajte tri različita konstruktora
// u main metodi pozovite konstruktor ove klase 
// u konstrukotoru ove klase napravite niz Dokumenata
// u koji ćete postaviti 3 instance s popunjenim vrijednostima
// stvojstava


public class ZadatakPrethodnaNastava {

	public static void main(String[] args) {
		
		
		Dokument[] dokument = new Dokument[3];
		dokument[0] = new Dokument("racun",1,1.12,true);
		dokument[1] = new Dokument("otrpemnica",21,2.18,true);
		dokument[2] = new Dokument("narudzba",18,0.64,false);
		

	}
	
	

}


	
	class Dokument{
		String opis;
		int redniBroj;
		double velicina;
		boolean readOnly;
		
		public Dokument(String opis,int redniBroj, double velicina, boolean readOnly){
			super();
			this.opis=opis;
			this.redniBroj=redniBroj;
			this.velicina=velicina;
			this.readOnly=readOnly;
			
		}
		
		public Dokument() {
			super();
		}
		
		public Dokument(String opis,int redniBroj) {
			super();
			this.opis=opis;
			this.redniBroj=redniBroj;
		}
		
		public Dokument(String opis) {
			super();
			this.opis=opis;
		}
		
		
	}
	
	

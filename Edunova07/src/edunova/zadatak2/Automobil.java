package edunova.zadatak2;

public class Automobil extends Vozilo{
	
	int maxPutnika;
	int brojVrata;
	String boja;
	
	
	public Automobil(int masa, int maksimalnaBrzina, int snaga, int maxPutnika, int brojVrata, String boja) {
		super(masa, maksimalnaBrzina, snaga);
		this.maxPutnika = maxPutnika;
		this.brojVrata = brojVrata;
		this.boja = boja;
	}


	public int getMaxPutnika() {
		return maxPutnika;
	}


	public void setMaxPutnika(int maxPutnika) {
		this.maxPutnika = maxPutnika;
	}


	public int getBrojVrata() {
		return brojVrata;
	}


	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}


	public String getBoja() {
		return boja;
	}


	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	
	
	
	
	
	

}

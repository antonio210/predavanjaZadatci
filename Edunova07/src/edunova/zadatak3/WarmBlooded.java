package edunova.zadatak3;

public abstract class WarmBlooded extends Vertebrates{

	String thermoRegulation; //Endothermy, Homeothermy or both
	boolean winterHiberation;
	
	
	public WarmBlooded(int height, int weight, boolean haveTeeth, int numberOfLimbs, String thermoRegulation,
			boolean winterHiberation) {
		super(height, weight, haveTeeth, numberOfLimbs);
		this.thermoRegulation = thermoRegulation;
		this.winterHiberation = winterHiberation;
	}


	public String getThermoRegulation() {
		return thermoRegulation;
	}


	public void setThermoRegulation(String thermoRegulation) {
		this.thermoRegulation = thermoRegulation;
	}


	public boolean isWinterHiberation() {
		return winterHiberation;
	}


	public void setWinterHiberation(boolean winterHiberation) {
		this.winterHiberation = winterHiberation;
	}
	
	
	
	
	
}

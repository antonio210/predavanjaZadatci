package edunova.zadatak3;

public class Mammals extends WarmBlooded{
	
	String mammalType;  //Monotremes, Marsupial or Placental Mammals
	boolean haveFur;
	
	
	public Mammals(int height, int weight, boolean haveTeeth, int numberOfLimbs, String thermoRegulation,
			boolean winterHiberation, String mammalType, boolean haveFur) {
		super(height, weight, haveTeeth, numberOfLimbs, thermoRegulation, winterHiberation);
		this.mammalType = mammalType;
		this.haveFur = haveFur;
	}


	public String getMammalType() {
		return mammalType;
	}


	public void setMammalType(String mammalType) {
		this.mammalType = mammalType;
	}


	public boolean isHaveFur() {
		return haveFur;
	}


	public void setHaveFur(boolean haveFur) {
		this.haveFur = haveFur;
	}
	
	
	
	}
	



package edunova.zadatak3;

public class Vertebrates extends Animals{
	
	boolean haveTeeth;
	int numberOfLimbs;
	
	
	public Vertebrates(int height, int weight, boolean haveTeeth, int numberOfLimbs) {
		super(height, weight);
		this.haveTeeth = haveTeeth;
		this.numberOfLimbs = numberOfLimbs;
	}


	public boolean isHaveTeeth() {
		return haveTeeth;
	}


	public void setHaveTeeth(boolean haveTeeth) {
		this.haveTeeth = haveTeeth;
	}


	public int getNumberOfLimbs() {
		return numberOfLimbs;
	}


	public void setNumberOfLimbs(int numberOfLimbs) {
		this.numberOfLimbs = numberOfLimbs;
	}
	


}

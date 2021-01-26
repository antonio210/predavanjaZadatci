package edunova.zadatak3;

public abstract class  Invertebrates extends Animals{
	
	boolean haveBrain;
	String respirationType;
	
	public Invertebrates(int height, int weight, boolean haveBrain, String respirationType) {
		super(height, weight);
		this.haveBrain = haveBrain;
		this.respirationType = respirationType;
	}

	public boolean isHaveBrain() {
		return haveBrain;
	}

	public void setHaveBrain(boolean haveBrain) {
		this.haveBrain = haveBrain;
	}

	public String getRespirationType() {
		return respirationType;
	}

	public void setRespirationType(String respirationType) {
		this.respirationType = respirationType;
	}
	
	
	
	
	

}

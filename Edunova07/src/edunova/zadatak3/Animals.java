package edunova.zadatak3;

public abstract class Animals {

	private int height;
	private int weight;

	public Animals(int height, int weight) {
		this.height = height;
		this.weight = weight;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

package be.pxl.ja;

public class Participant {
	private String name;
	private int points;

	public Participant(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Participant{" +
				"name='" + name + '\'' +
				", points=" + points +
				'}';
	}
}

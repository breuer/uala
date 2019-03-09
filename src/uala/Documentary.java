package uala;

public class Documentary extends Product {

	static final String INTERESTING = "unofficial";

	@Override
	public boolean isInteresting() {
		// TODO Auto-generated method stub
		return getName().contains(INTERESTING);
	}
	
	public Documentary(String name, int duration, String release) {
		setName(name);
		setDurationMinutes(duration);
		setReleaseYear(release);
	}

}

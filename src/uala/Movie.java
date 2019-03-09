package uala;

public class Movie extends Product{

	private int oscars = 0;

	public int getOscars() {
		return oscars;
	}

	public void setOscars(int oscars) {
		this.oscars = oscars;
	}

	@Override
	public boolean isInteresting() {
		// TODO Auto-generated method stub
		
		return oscars > 0;
	}
	
	public Movie(String name, int duration, String release, int oscars) {
		setName(name);
		setDurationMinutes(duration);
		setReleaseYear(release);
		setOscars(oscars);
	}

}

package uala;


public class Serie extends Product {

	private int seasons;

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	@Override
	public boolean isInteresting() {
		// TODO Auto-generated method stub
		return (seasons == 4) || (seasons == 5);
	}
	
	public Serie(String name, int duration, int seasons, String release) {
		this.setName(name);
		this.setDurationMinutes(duration);
		this.setSeasons(seasons);
		this.setReleaseYear(release);
	}

}

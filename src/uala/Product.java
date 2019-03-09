package uala;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Product {

	private Date releaseYear;
	private int durationMinutes;
	private String name;
	
	private static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance(Locale.US);
	    cal.setTime(date);
	    return cal;
	}
	
	public abstract boolean isInteresting();	

	public boolean isOld() {
		return moreThan(2);
	}
	
	public boolean moreThan(int year) {
		Calendar release = getCalendar(releaseYear);
	    Calendar now = getCalendar(new Date());
	    int diff = now.get(Calendar.YEAR) - release.get(Calendar.YEAR);
		return diff > year;
	}
	
	public Date getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
        try {

            date = formatter.parse(releaseYear);

        } catch (ParseException e) {
            e.printStackTrace();
        }
		this.releaseYear = date;
	}
	public int getDurationMinutes() {
		return durationMinutes;
	}
	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

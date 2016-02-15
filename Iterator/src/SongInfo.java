
public class SongInfo {
	private String singer;
	private String title;
	private int year;
	
	public SongInfo(String singer, String title, int year) {
		this.singer = singer;
		this.title = title;
		this.year = year;
	}

	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}
}

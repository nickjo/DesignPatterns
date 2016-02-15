
public class Main {
	public static void main(String[] args) {
		Song90sRecord song90s = new Song90sRecord();
		Song00sRecord song00s = new Song00sRecord();
		Song10sRecord song10s = new Song10sRecord();
		
		DisplaySongs displaySongs = new DisplaySongs(song90s, song00s, song10s);

		try {
			displaySongs.showAllSongs();
			System.out.println("\n=====Use Iterator====");
			displaySongs.showAllSongsIterator();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

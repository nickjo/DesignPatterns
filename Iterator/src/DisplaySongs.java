import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DisplaySongs {
	Song90sRecord song90s;
	Song00sRecord song00s;
	Song10sRecord song10s;
	
	SongIterator song90sIterator;
	SongIterator song00sIterator;
	SongIterator song10sIterator;


	public DisplaySongs(Song90sRecord song90s, Song00sRecord song00s, Song10sRecord song10s) {
		// TODO Auto-generated constructor stub
		this.song90s = song90s;
		this.song00s = song00s;
		this.song10s = song10s;
		
		song90sIterator = song90s;
		song00sIterator = song00s;
		song10sIterator = song10s;
	}

	public void displaySong90s() throws Exception{
		SongInfo[] arraySong90s = song90s.arraySong90s;
		
		System.out.println("###90³â´ë È÷Æ®°î### ");
		for(int i=0; i < arraySong90s.length; i++){
			System.out.println(arraySong90s[i].getSinger() +", " + 
					arraySong90s[i].getTitle() + ", " + 
					arraySong90s[i].getYear());
		}
	}

	public void displaySong00s() throws Exception{
		ArrayList<SongInfo> arrayListSong00s = song00s.arrayListSong00s;
		
		System.out.println("\n###2000³â´ë È÷Æ®°î###");
		for(int i=0; i< arrayListSong00s.size(); i++){
			System.out.println(arrayListSong00s.get(i).getSinger() + ", " +
					arrayListSong00s.get(i).getTitle() + ", " +
					arrayListSong00s.get(i).getYear()
					);
		}
	}

	public void displaySong10s() throws Exception{
		Hashtable<String, SongInfo> hashSong10s = song10s.hashSong10s;
		
		System.out.println("\n###2010³â´ë ÈñÆ®°î###");
		Enumeration keys = hashSong10s.keys();
		while(keys.hasMoreElements()){
			String key =  (String)keys.nextElement();
			System.out.println(hashSong10s.get(key).getSinger() + "," +
					hashSong10s.get(key).getTitle() + "," +
					hashSong10s.get(key).getYear()
					);
		}
	}
	
	public void showAllSongs() throws Exception{
		displaySong90s();
		displaySong00s();
		displaySong10s();
	}
	
	/*
	 * Iterator¸¦ »ç¿ëÇÏ¿© Ãâ·Â
	 * 
	 * */ 
	public void showAllSongsIterator(){
		Iterator song90s = song90sIterator.createIterator();
		Iterator song00s = song00sIterator.createIterator();
		Iterator song10s = song10sIterator.createIterator();
		
		System.out.println("###90³â´ë È÷Æ®°î### ");
		displaySongIterator(song90s);
		
		System.out.println("\n###2000³â´ë È÷Æ®°î###");
		displaySongIterator(song00s);
		
		System.out.println("\n###2010³â´ë ÈñÆ®°î###");
		displaySongIterator(song10s);
	}
	
	public void displaySongIterator(Iterator iterator){
		while(iterator.hasNext()){
			SongInfo songInfo = (SongInfo) iterator.next();
			
			System.out.println(songInfo.getSinger() + ", " + 
					songInfo.getTitle() + ", " +
					songInfo.getYear()
					);
		}
	}
}

import java.util.Hashtable;
import java.util.Iterator;

public class Song10sRecord implements SongIterator{
	Hashtable<String, SongInfo> hashSong10s = new Hashtable<String, SongInfo>(); 
	
	public Song10sRecord() {
		hashSong10s.put("0", new SongInfo("����", "������Ÿ��", 2012));
		hashSong10s.put("1", new SongInfo("ũ������", "������", 2013));
		hashSong10s.put("2", new SongInfo("����", "������", 2013));
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return hashSong10s.values().iterator();
	}
}

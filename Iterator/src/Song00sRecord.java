import java.util.ArrayList;
import java.util.Iterator;

public class Song00sRecord implements SongIterator{
	ArrayList<SongInfo> arrayListSong00s = new ArrayList<SongInfo>();
	
	public Song00sRecord() {
		arrayListSong00s.add(new SongInfo("������", "Tears",2000));
		arrayListSong00s.add(new SongInfo("���������", "�����ϳ�",2001));
		arrayListSong00s.add(new SongInfo("������", "Dash",2003));
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return arrayListSong00s.iterator();
	}
}

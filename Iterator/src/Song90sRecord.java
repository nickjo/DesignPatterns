import java.util.Arrays;
import java.util.Iterator;

public class Song90sRecord implements SongIterator{
	SongInfo[] arraySong90s = new SongInfo[3];
	int arrVal = 0;
	
	public Song90sRecord() {
		arraySong90s[arrVal++] = new SongInfo("��", "�ƽ��Ǹ�", 1995);
		arraySong90s[arrVal++] = new SongInfo("�ڹ̰�", "�̺��ǰ��", 1995);
		arraySong90s[arrVal++] = new SongInfo("Cool", "���", 1997);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(arraySong90s).iterator();
	}
}

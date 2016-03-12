import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Adapter ap = new AdapterImpl();
		List<Integer> list = new ArrayList<>();
		Integer[] intArr = new Integer[10];
		Stream stream;
		
		// array�� ������ 0~9 ���� ���� �Է�
		Arrays.setAll(intArr, i -> (int)(Math.random()*9));
		// list�� ����
		Collections.addAll(list, intArr);
		
		System.out.println("=====List ���========");
		stream = list.stream();		
		stream.limit(intArr.length-1).forEach(System.out::print);
		
		System.out.println();
		
		// list�� sort ��
		list = ap.sorted(list);
		stream = list.stream();		
		stream.limit(intArr.length-1).forEach(System.out::print);
		System.out.println('\n');
		
		System.out.println("=========Array ���=========");
		stream = Arrays.asList(intArr).stream();
		stream.limit(intArr.length-1).forEach(System.out::print);
		System.out.println();
		// Array��  sort �� 
		list = ap.sorted(intArr);
		stream = list.stream();		
		stream.limit(intArr.length-1).forEach(System.out::print);
	}
}

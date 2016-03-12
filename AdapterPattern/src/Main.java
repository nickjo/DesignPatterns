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
		
		// array에 랜덤한 0~9 수의 정수 입력
		Arrays.setAll(intArr, i -> (int)(Math.random()*9));
		// list에 복사
		Collections.addAll(list, intArr);
		
		System.out.println("=====List 출력========");
		stream = list.stream();		
		stream.limit(intArr.length-1).forEach(System.out::print);
		
		System.out.println();
		
		// list를 sort 함
		list = ap.sorted(list);
		stream = list.stream();		
		stream.limit(intArr.length-1).forEach(System.out::print);
		System.out.println('\n');
		
		System.out.println("=========Array 출력=========");
		stream = Arrays.asList(intArr).stream();
		stream.limit(intArr.length-1).forEach(System.out::print);
		System.out.println();
		// Array를  sort 함 
		list = ap.sorted(intArr);
		stream = list.stream();		
		stream.limit(intArr.length-1).forEach(System.out::print);
	}
}

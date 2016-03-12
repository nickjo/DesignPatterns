import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterImpl implements Adapter{
	List classList = new ArrayList<>();
	
	@Override
	public List sorted(List list) {
		return SortedClass.sort(list);
	}

	@Override
	public List sorted(Integer[] list) {
		// TODO Auto-generated method stub
		classList = Arrays.asList(list);
		return SortedClass.sort(classList);
	}

	@Override
	public List sorted(double[] list) {
		// TODO Auto-generated method stub
		return null;
	}

}

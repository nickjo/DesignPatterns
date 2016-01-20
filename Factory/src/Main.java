import concrete.HpCreator;
import concrete.MpCreator;
import framework.Item;
import framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		// HpPosion
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		System.out.println();
		
		// MpPosion
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}

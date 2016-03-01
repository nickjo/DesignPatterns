package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("MpPosion ���� ��û");
	}

	@Override
	protected void createItemLog() {
		System.out.println("Mpposion �α׻��� " + new Date());
	}

	@Override
	protected Item createItem() {
		return new MpPosion();
	}

	
}

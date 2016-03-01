package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("HpPosion ���� ��û");
	}

	@Override
	protected void createItemLog() {
		System.out.println("HpPosion �α� ���� " + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPosion();
	}

}

package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("Request HpPosion's infomation from DB");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("Make HpPosion's log in DB " + new Date());
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPosion();
	}

}

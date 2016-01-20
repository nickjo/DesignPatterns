package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("Request MpPosion's infomation from DB");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("Make MpPosion's log in DB " + new Date());
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new MpPosion();
	}

}

package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("MpPosion 정보 요청");
	}

	@Override
	protected void createItemLog() {
		System.out.println("Mpposion 로그생성 " + new Date());
	}

	@Override
	protected Item createItem() {
		return new MpPosion();
	}

	
}

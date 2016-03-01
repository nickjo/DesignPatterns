package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("HpPosion 정보 요청");
	}

	@Override
	protected void createItemLog() {
		System.out.println("HpPosion 로그 생성 " + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPosion();
	}

}

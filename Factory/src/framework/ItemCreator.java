package framework;

public abstract class ItemCreator {
	// 템플릿 메소드
	public Item create(){
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	// 아이템 생성 전 데이터베이스에 아이템 정보를 요청
	abstract protected void requestItemsInfo();
	// 아이템 생성 후 데이터베이스 아이템 생성 정보를 남김
	abstract protected void createItemLog();
	// 아이템 생성
	abstract protected Item createItem();
}

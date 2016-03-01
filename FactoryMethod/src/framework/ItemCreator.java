package framework;

public abstract class ItemCreator {
	// 팩토리 메소드 패턴 
	public Item create(){
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		return item;
	}
	
	abstract protected void requestItemsInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();
}

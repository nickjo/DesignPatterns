package framework;

public abstract class ItemCreator {
	// ���丮 �޼ҵ� ���� 
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

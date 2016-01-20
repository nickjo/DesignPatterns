package framework;

public abstract class ItemCreator {
	// ���ø� �޼ҵ�
	public Item create(){
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	// ������ ���� �� �����ͺ��̽��� ������ ������ ��û
	abstract protected void requestItemsInfo();
	// ������ ���� �� �����ͺ��̽� ������ ���� ������ ����
	abstract protected void createItemLog();
	// ������ ����
	abstract protected Item createItem();
}

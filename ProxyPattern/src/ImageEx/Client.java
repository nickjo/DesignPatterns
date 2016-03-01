package ImageEx;

public class Client {
	public static void main(String[] args) {
		Subject proxy = new Proxy();
		
		proxy.showImage();
		proxy.showImage();
		proxy.showImage();
	}
}

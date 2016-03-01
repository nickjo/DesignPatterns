package ImageEx;
public class Proxy implements Subject{
	RealSubject real;

	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		if(real == null){
			real = new RealSubject();
			real.loadImage();
		}
		
		real.showImage();
		System.out.println();
	}
}

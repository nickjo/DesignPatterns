package ImageEx;

public class RealSubject implements Subject{

	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		System.out.println("이미지를 출력합니다.");
	}
	
	public void loadImage(){
		System.out.println("이미지를 로딩하였습니다.");
	}
}

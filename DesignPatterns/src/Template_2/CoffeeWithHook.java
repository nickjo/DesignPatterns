package Template_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("���ͷ� Ŀ�Ǹ� ������� ��");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ �߰��ϴ� ��");
	}
	
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}
	
	private String getUserInput(){
		String answer = null;
		
		System.out.println("Ŀ�ǿ� ������ ������ �־� �帱���? (y/n) ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			answer = in.readLine();
		}catch(IOException e){
			System.err.println("IO ����");
		}
		
		if(answer == null){
			return "no";
		}
		return answer;
	}
}
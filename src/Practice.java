import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		
		// 값을 입력하기 위해 Scanner 클래스 입력
		Scanner scanner = new Scanner(System.in);
		
		//상대방이 낼 가위바위보 설정을 Math.random 함수 이용하여 설정
		//Math.random 함수는 실수형이기 때문에, int 정수형으로 변환 후
		//가위,바위,보 3개의 보기가 있기 때문에 3을 곱해준 후 +1 하여 만들어준다.
		//+1 하는 이유는 3을 곱하면 값이 0부터 시작하기 때문에 +1하여 3까지 포함되게 만들어주는 것.
		int computerNumber = (int)(Math.random() * 3) + 1;
		
		//보기를 눈에 보이게끔 아래 질문을 만들어준다.
		System.out.print("1가위, 2바위, 3보");
		
		//nextLine으로 하면 아래 조건문을 사용할 수 없기 때문에
		//nextInt 사용하여 숫자로 가위바위보 할 수 있게끔 만든다.
		int user = scanner.nextInt();
		
		System.out.print("컴퓨터가 ");
		
		if(computerNumber == 1) 
		{
			System.out.print("바위");
		}
		else if(computerNumber == 2) 
		{
			System.out.print("가위");
		}
		else
		{
			System.out.print("보");
		}
			System.out.println("를 냈습니다.");
		
		//===================================	
		System.out.print("사용자가 ");
		if(user == 1) 
		{
			System.out.print("바위");
		}
		else if(user == 2)
		{
			System.out.print("가위");
		}
		else
		{
			System.out.print("보");
		}
			System.out.println("를 냈습니다.");
			
		
		//====================================
	
		if(user == computerNumber)
		{
			System.out.println("비겼습니다.");
		}
		else if((computerNumber == 2 && user == 1) || (computerNumber == 3 && user == 2 ) || (computerNumber == 1 && user == 3))
		{
			System.out.println("이겼습니다.");
		}
		else
		{
			System.out.println("졌습니다.");
		}
	}

}

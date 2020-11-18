package ex1_work;

import java.util.Random;

public class WordScramble {
	//정답 단어를 반환하고, 문제를 출제하기위한 클래스
	String[] strArr = {"HOPE", "APPLE", "DOCTOR"};
	String shake = ""; //섞여진 단어가 들어갈 변수

	//정답을 메인으로 반환하는 메서드

	public String getAnswer() {
		int idx = new Random().nextInt(strArr.length); //유지보수를 위해 length로 !
		return strArr[idx];
		
	}
	//정답을 섞어 문제를 출제하는 메서드
	public String getQuestion(String str) {
//		String aa = getAnswer(); 이렇게 쓸경우에는 getAnswer()를 다시 호출하기 때문에 값이 달라진다.
		//정답단어의 수 만큼 배열을 생성하여 중복되지 않는 난수를 넣자!!
		int[] inArr = new int[str.length()];
		
		outer : for(int i = 0; i < inArr.length;) {
			
			inArr[i] = new Random().nextInt(str.length()); 
			
			for(int j = 0; j < i; j++) {
				if(inArr[i] == inArr[j]) {
					continue outer;
				}//for
				
			}//inner
			i++;
		}//outer
		
		for(int i = 0; i < str.length(); i++) {
			//랜덤으로 나온 정수의 자릿 수에 맞게 inArr의 배열 자리에 넣어서 문자를 이어 붙인다.
			shake += str.charAt(inArr[i]);
		}//for
		return shake;//섞인 정답을 반환(문제출제)
	
	}




}

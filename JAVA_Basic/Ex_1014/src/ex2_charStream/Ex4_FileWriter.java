package ex2_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4_FileWriter {
	public static void main(String[] args) {

		//2byte씩 데이터를 기록한다.
		FileWriter fw = null;

		String path = "C:\\YSK\\java_0914_ysk\\filewriter예제.txt";

		try {
			
			fw = new FileWriter(path);
			
			String msg1 = "나는 filewriter의 예제다!!";
			String msg2 = "\n 두번째 줄도 가능!!";
			
			fw.write(msg1);//byte로 만들 필요가 없다..
			fw.write(msg2);
			//fw를 close()할 때, 내용을 물리적으로 가록하는 flush()메서드가 자동으로
			//호출되기 때문에, 반드시 close()를 통해 작성하고자 하는 내용을
			//물리적으로 기록할 수 있도록 처리해줘야 한다.
			//fw.flush();
			
		} catch (Exception e) {

		}finally {
			//JVM기준에서 close를 해주지 않으면 기록이 아직 진행중이라고 생각하기 
			//때문에 실행해도 데이터가 기록되지 않는다. 
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}//main
}

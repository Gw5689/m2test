package m1.model;

import java.util.*;

public class GuguService {
	public ArrayList<String> getGugudanList(int dan) { // 참조타입으로 인트값 하나를 받아야함
		// ArrayList new 연산자로 생성 <참조타입>
		ArrayList<String> list = new ArrayList<String>();
		// 반복문 
		for(int i=1; i<10; i++) { // i는 1부터 10보다 작을때 까지 반복
			list.add(dan +"X"+ i +"=" + (dan*i));
		}
		// list를 리턴
		return list;
	}
}

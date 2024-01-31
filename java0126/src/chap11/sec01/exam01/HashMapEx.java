package chap11.sec01.exam01;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //String=key,Integer=vlaue
		map.put("김하나", 85);
		map.put("이하나", 70);
		map.put("박하나", 95);
		map.put("이하나", 20); // 마지막에 저장된 키의 값을 읽음(값이 바뀌는건 중복 저장 가능)
		System.out.println(map.get("이하나"));//키(이름)으로 값(점수)검색
		System.out.println(map.size());//저장된 총 Entry 수 얻기			
	}
}
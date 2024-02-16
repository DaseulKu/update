package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> list 
//					= new ArrayList<>();list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
					= Arrays.asList(1,2,3,4,5);
		
		list.stream()
		
//		.filter(i->i%2==0)
//		.map(i->i*2)
		.map(i->"요소는"+i+"입니다")
		.limit(3) // 중간처리 여러개가능
		
//		.forEach(i->System.out.println(i));
		.forEach(System.out::println);
		
//		for (Integer i : list) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
	}
}
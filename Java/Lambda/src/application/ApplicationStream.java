package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ApplicationStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3, 5, 10, 7);
		
		Stream <Integer> st1 = list.stream().map(x -> x * 10);
		//System.out.println(Arrays.toString(st1.toArray()));
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Ma", "Be", "Bo"); //Criou a stream aqui
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}

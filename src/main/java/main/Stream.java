package test;

import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {
		stream(30);
	}

	public static void stream(int i) {
		IntStream.rangeClosed(1, 30).forEach(System.out::println);
	}

}

package test;

public class Recursive {

	public static void main(String[] args) {
		fizzBuzz(30);
	}

	public static void fizzBuzz(int i) {
		if (i < 0) {
			return;
		}
		System.out.println(i);
	}

}

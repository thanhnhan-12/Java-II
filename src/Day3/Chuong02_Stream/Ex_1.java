package Day3.Chuong02_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Ex_1 {
	public static void main(String []a) {
		// cach 1: Theo kieu object
		List<String> strings = Arrays.asList("Java_First","Java_2","Java_3","Java_4","Java_last");
		Optional<String> firstString = strings.stream().findFirst();
		if (firstString.isPresent()) {
		   System.out.println("The first string is: " + firstString.get());
		} else {
		   System.out.println("The stream is empty.");
		}
		// cahc 2: Theo kieu nguyen thuy
		IntStream numbers = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		int firstNumber = numbers.findFirst().getAsInt();
		System.out.println("The first number is: " + firstNumber);

	}
}

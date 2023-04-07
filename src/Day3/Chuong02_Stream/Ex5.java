package Day3.Chuong02_Stream;

import java.util.function.Supplier;
import java.util.stream.*;
public class Ex5 {
    public static void main(String[] args) {
//		  Stream<String> stream = Stream.of("foo", "bar", "baz");
		        // Get the index and corresponding value and print them
		  Supplier<Stream<String>> supLier = () -> Stream.of("G","e","e","k","s");
//		  IntStream.range(0, (int) stream.count()).forEach(i -> System.out.println(i + " : " + stream.skip(i).findFirst().get()));
		  IntStream.range(0, (int) supLier.get().count()).forEach(i -> System.out.println(i+" : "+supLier.get().skip(i).findFirst().get()));
	}
}

package be.pxl.ja;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectOperation {

	public static void main(String[] args) {

		List<String> theBeatles =
				Stream.of("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr")
				.collect(Collectors.toList());
		System.out.println(theBeatles);
	}

}

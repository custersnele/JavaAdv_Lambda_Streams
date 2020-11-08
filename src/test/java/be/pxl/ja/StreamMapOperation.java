package be.pxl.ja;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamMapOperation {


	@Test
	public void mapToUpperCase() {
		List<String> animals = Stream.of("zebra", "dog", "dolphine")
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		assertEquals(Arrays.asList("ZEBRA", "DOG", "DOLPHINE"), animals);
	}

	@Test
	public void mapToLengths() {
		List<Integer> lengths = Stream.of("zebra", "dog", "dolphine")
				.map(String::length)
				.collect(Collectors.toList());

		assertEquals(Arrays.asList(5, 3, 8), lengths);
	}


	@Test
	public void mapToLengthsBis() {
		List<String> animals = Arrays.asList("zebra", "dog", "dolphine");
		List<String> names = Arrays.asList("Wannes", "Hans");
		List<String> cities = Arrays.asList("Amsterdam", "Kopenhagen", "Oslo");
		List<Integer> lengths = Stream.of(animals, names, cities).flatMap(l -> l.stream().map(String::length)).collect(Collectors.toList());

		assertEquals(Arrays.asList(5, 3, 8, 6, 4, 9, 10, 4), lengths);
	}
}

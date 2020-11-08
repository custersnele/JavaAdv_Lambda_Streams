package be.pxl.ja;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamSortedOperation {

	@Test
	public void sortingAlphabetically() {
		List<String> sortedList = Stream.of("zebra", "dog", "dolphine")
				.sorted()
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("dog", "dolphine", "zebra"), sortedList);
	}

	@Test
	public void sortingLongToShort() {
		List<String> sortedList = Stream.of("zebra", "dog", "dolphine")
				.sorted((x, y) -> y.length() - x.length())
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("dolphine", "zebra", "dog"), sortedList);
	}

}

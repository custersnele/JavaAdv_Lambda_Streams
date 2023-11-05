package be.pxl.ja;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamLimitOperation {

	@Test
	public void limit() {
		List<String> animals = Stream.of("zebra", "dog", "elephant", "camel", "cat", "fish", "dolphine").limit(4).toList();
		assertEquals(4, animals.size());
		assertEquals(Arrays.asList("zebra", "dog", "elephant", "camel"), animals);
	}

	@Test
	public void limitWithInfiniteStream() {
		List<Integer> numbers = Stream.iterate(1, n -> n + n).limit(5).toList();

		assertEquals(Arrays.asList(1,2,4,8,16), numbers);
	}

}

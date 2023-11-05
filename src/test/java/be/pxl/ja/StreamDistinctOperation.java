package be.pxl.ja;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamDistinctOperation {


	@Test
	public void removingDoubles() {
		List<String> withoutDoubles = Stream.of("zebra", "dog", "zebra", "dolphine")
				.distinct()
				.toList();
		assertEquals(3, withoutDoubles.size());
	}


}

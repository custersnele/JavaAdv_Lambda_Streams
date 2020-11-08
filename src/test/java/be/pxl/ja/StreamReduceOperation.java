package be.pxl.ja;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamReduceOperation {
	private Random random = new Random();

	@Test
	public void sumWithReduce() {
		List<Integer> randomNumbers = random.ints(15, 0, 100).boxed().collect(Collectors.toList());
		long sum1 = randomNumbers.stream().mapToInt(x -> x).sum();
		int sum2 = randomNumbers.stream().reduce(0, (sumSoFar, nextElement) -> sumSoFar + nextElement);
		int sum3 = randomNumbers.stream().reduce(0, Integer::sum);

		assertEquals(sum1, sum2);
		assertEquals(sum2, sum3);
	}

}

package be.pxl.ja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntStreamTests {

	private List<Participant> participants;
	private Random random = new Random();

	@BeforeEach
	public void init() {
		Participant john = new Participant("John P.", 15);
		Participant sarah = new Participant("Sarah M.", 200);
		Participant charles = new Participant("Charles B.", 150);
		Participant mary = new Participant("Mary T.", 1);

		participants = Arrays.asList(john, sarah, charles, mary);
	}


	@Test
	public void totalPoints() {

		long totalPoints = participants.stream().mapToInt(Participant::getPoints).sum();

		assertEquals(366, totalPoints);
	}

	@Test
	public void amountOfNumbersBetween10And20() {

		long count = IntStream.rangeClosed(10, 20).count();

		assertEquals(11, count);
	}

	@Test
	public void findMinMaxAndAverage() {
		List<Integer> randomNumbers = random.ints(15, 0, 100).boxed().toList();
		int max = randomNumbers.stream().mapToInt(x -> x).max().getAsInt();
		int min = randomNumbers.stream().mapToInt(x -> x).max().getAsInt();
		double average = randomNumbers.stream().mapToInt(x -> x).max().getAsInt();
		assertTrue(min <= average);
		assertTrue(max >= average);

		IntSummaryStatistics intSummaryStatistics = random.ints(15, 0, 100).summaryStatistics();
		assertTrue(intSummaryStatistics.getMax() >= intSummaryStatistics.getMin());
	}

}

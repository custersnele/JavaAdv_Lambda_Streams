package be.pxl.ja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamFilterOperation {

	private List<Participant> participants;
	private Participant sarah;
	private Participant charles;

	@BeforeEach
	public void init() {
		Participant john = new Participant("John P.", 15);
		sarah = new Participant("Sarah M.", 200);
		charles = new Participant("Charles B.", 150);
		Participant mary = new Participant("Mary T.", 1);

		participants = Arrays.asList(john, sarah, charles, mary);
	}


	@Test
	public void filterEvenNumbers() {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		assertEquals(Arrays.asList(2, 4), evenNumbers);
	}

	@Test
	public void filterContainingO() {

		List<String> animals = Stream.of("zebra", "dog", "dolphine")
				.filter(a -> a.contains("o"))
				.collect(Collectors.toList());

		assertEquals(Arrays.asList("dog", "dolphine"), animals);
	}

	@Test
	public void filterParticipantsWithOver100Points() {

		List<Participant> over100Points = participants.stream().filter(p -> p.getPoints() > 100).collect(Collectors.toList());

		assertEquals(Arrays.asList(sarah, charles), over100Points);
	}

	@Test
	public void filterParticipantsNameStartingWithSAndOver100Points() {

		Predicate<Participant> over100Points = p -> p.getPoints() > 100;
		Predicate<Participant> startingWithS = p -> p.getName().startsWith("S");

		Stream<Participant> stream = participants.stream();
		System.out.println(stream.getClass());
		List<Participant> winner = stream.filter(over100Points.and(startingWithS)).collect(Collectors.toList());

		assertEquals(Collections.singletonList(sarah), winner);
	}

	@Test
	public void filterParticipantsWithOver100PointsV2() {

		List<Participant> over100Points = participants.stream().filter(p -> p.getPoints() > 100).collect(Collectors.toList());

		assertEquals(Arrays.asList(sarah, charles), over100Points);
	}


	@Test
	public void countWithOver100Points() {

		long over100Points = participants.stream().filter(p -> p.getPoints() > 100).count();

		assertEquals(2, over100Points);
	}

}

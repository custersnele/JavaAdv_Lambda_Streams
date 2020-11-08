package be.pxl.ja;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamForEachOperation {

	public static void main(String[] args) {
		Participant john = new Participant("John P.", 15);
		Participant sarah = new Participant("Sarah M.", 200);
		Participant charles = new Participant("Charles B.", 150);
		Participant mary = new Participant("Mary T.", 1);

		List<Participant> participants = Arrays.asList(john, sarah, charles, mary);

		participants.stream().filter(p -> p.getPoints() >= 200).forEach(System.out::println);

		System.out.println("* All participants *");

		participants.forEach(System.out::println);

		System.out.println("* With Map *");

		Map<String, Integer> stock = new HashMap<>();
		stock.put("Uno", 12);
		stock.put("Memory", 10);
		stock.put("Bonanza", 8);
		stock.put("Schaakspel", 14);

		stock.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
	}

}

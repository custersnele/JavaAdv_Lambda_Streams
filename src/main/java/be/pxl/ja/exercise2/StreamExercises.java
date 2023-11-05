package be.pxl.ja.exercise2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExercises {

	public static void main(String[] args) {
		// Exercise 1: Print all fruits containing an 'a' in uppercase
		List<String> stringList = Arrays.asList("apple", "banana", "cherry", "watermelon");


		// Exercise 2 : Map the list of strings to their first character.
		List<Character> firstCharacters = null;
		System.out.println(firstCharacters);


		// Exercise 3: Count the number of long strings (length > 6) from list of strings
		int longStrings = 0;


		// Exercise 4: Filter even numbers from a list of integers. Print the result.
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> evenNumbers = null;
		System.out.println("Even numbers " + evenNumbers);


		// Exercise 5: Map all integers to their absolute value. Only maintain unique values.
		// Filter odd values and sort big to small. Print the result.
		List<Integer> intList2 = Arrays.asList(1, -7, -4, 7, 9, -9, 4, 5, 6, 7, 8, 9);
		List<Integer> sortedNumbers = null;


		// Exercise 6: Map a list of integers to their squares and filter even squares
		List<Integer> evenSquares = null;
		System.out.println("Even squares: " + evenSquares);

		// Exercise 7: Map a list of integers to their cubes and filter cubes less than 100
		List<Integer> smallCubes = null;
		System.out.println("Small cubes: " + smallCubes);

		// Exercise 8: Find the maximum value from a list of doubles.
		List<Double> doubleList = Arrays.asList(1.2, 3.4, 2.0, 5.5, 4.1);
		double maxDouble = 0.0;
		System.out.println("Max: " + maxDouble);

		// Exercise 9: Map a list of doubles to their int value and filter even values
		List<Integer> evenInts = null;
		System.out.println("Even integers: " + evenInts);

		// Exercise 10: Map a list of doubles to their half values and filter values less than 2.0
		List<Double> smallHalfValues = null;
		System.out.println("Small half values: " + smallHalfValues);

		// Exercise 11: Get the name of the games from the list. Remove duplicates.
		List<GameScore> gameScores = Arrays.asList(
				new GameScore("Uno", 5),
				new GameScore("Carcassonne", 32),
				new GameScore("Galgje", 12),
				new GameScore("Carcassonne", 25)
		);
		List<String> games = null;
		System.out.println(games);

		// Exercise 12: Filter GameScore objects with a score greater than 20. Print the results.
		List<GameScore> filteredGameScores = null;


		// Exercise 13: Find the GameScore with the maximum score from the gameScore list. Print the result.
		GameScore maxGameScore = null;

	}
}
